package fr.eni.formation.banque.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.formation.banque.dao.ClientDAO;

@WebServlet("/client")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ClientDAO dao = new ClientDAO();
	
	long id;
	String nom;
	String prenom;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "create":
			nom = request.getParameter("nom");
			prenom = request.getParameter("prenom");
			
			dao.create(nom, prenom);
			response.sendRedirect("client?action=read-all");
			break;
		case "read-all":
			
			request.setAttribute("clients", dao.readAll());
			
			request.getRequestDispatcher("/").forward(request, response);
			break;
		case "read":
			id = Long.parseLong(request.getParameter("id"));
			request.setAttribute("client", dao.read(id));
			
			request.getRequestDispatcher("/").forward(request, response);
			break;
		case "read-nom":
			nom = request.getParameter("nom");
			request.setAttribute("client", dao.readNom(nom));
			
			request.getRequestDispatcher("/").forward(request, response);
			break;

		default:			
			request.getRequestDispatcher("/").forward(request, response);
			break;
		}
		
		
		
		
	}

}

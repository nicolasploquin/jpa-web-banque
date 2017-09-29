package fr.eni.formation.banque.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ApplicationListener implements ServletContextListener {
	
	


    public void contextInitialized(ServletContextEvent event) { 
         
//    	factory = Persistence.createEntityManagerFactory("mysql-banque");
//    	event.getServletContext().setAttribute("emFactory", factory);
    	
//    	EntityManager em = factory.createEntityManager();
//    	System.out.println("EntityManager créé.");
//    	
////    	BanqueDAO.createClient(em, "Ainslie", "Ben");
//    	
//    	em.getTransaction().begin();
//    	
//    	Client cli1 = new Client("Ainslie", "Ben");
//    	Client cli2 = new Client("Scheidt", "Robert");
//    	em.persist(cli1);
//    	em.persist(cli2);
//    	
//    	em.getTransaction().commit();
//    	
//    	em.close();
    	
    }
	
    public void contextDestroyed(ServletContextEvent event)  { }
}

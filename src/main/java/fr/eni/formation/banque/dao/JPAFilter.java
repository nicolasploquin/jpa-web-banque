package fr.eni.formation.banque.dao;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter({"/client","/compte"})
public class JPAFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// JPAUtil.getEntityManager();
		
		chain.doFilter(request, response);
		
		JPAUtil.closeEntityManager();
		
	}

	public void init(FilterConfig config) throws ServletException {}
	public void destroy() {}
	
	
	

}

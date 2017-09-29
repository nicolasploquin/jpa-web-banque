package fr.eni.formation.banque.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	private static ThreadLocal<EntityManager> thread = new ThreadLocal<>();
	
	static {
		
		factory = Persistence.createEntityManagerFactory("mysql-banque");
		
	}
	
	
	public static EntityManager getEntityManager() {
		EntityManager em = thread.get();
		if(em == null || !em.isOpen()) {
			em = factory.createEntityManager();
			thread.set(em);
			System.out.println("EntityManager créé.");
		}
		return em;
	}
	
	public static void closeEntityManager() {
		EntityManager em = thread.get();
		if(em != null && em.isOpen()) em.close();
		thread.set(null);
	}
	

}

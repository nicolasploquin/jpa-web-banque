package fr.eni.formation.banque.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import fr.eni.formation.banque.Client;

public class ClientDAO {

	public void create(String nom, String prenom) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		Client client = new Client(nom, prenom);
		
		em.persist(client);
		
		em.getTransaction().commit();
		
		
	}
	public List<Client> readAll() {
		EntityManager em = JPAUtil.getEntityManager();
		
		Query query = em.createQuery("from Client");
		List<Client> liste = query.getResultList();

		return liste;
		
	}
	public Client read(long id) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Client client = (Client)em.find(Client.class, new Long(id));

		return client;
		
	}
	public Client readNom(String nom) {

		EntityManager em = JPAUtil.getEntityManager();
		
		Query query = em.createQuery("from Client where nom = :nom");
		query.setParameter("nom", nom);
		
		Client client;
		try {
			client = (Client)query.getSingleResult();
		} catch (NoResultException e) {
			client = null;
		}


		return client;
		
	}
	
}

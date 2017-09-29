package fr.eni.formation.banque;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

public class BanqueDAO {

	@Transactional(TxType.REQUIRED)
	public static void createClient(EntityManager em, String nom, String prenom) {
		Client cli1 = new Client(nom, prenom);
    	em.persist(cli1);
	}
	
}

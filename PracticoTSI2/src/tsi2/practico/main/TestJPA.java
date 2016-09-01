package tsi2.practico.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import tsi2.practico.entity.Role;
import tsi2.practico.entity.User;

public class TestJPA {

	public static void main(String[] args) {
		
		
		Role r = new Role("Role Administrador", "ADMIN12");
		User user = new User("us212", "ps1", "n1", "l1", "cdbrios@gmail.com", r);
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			emf = Persistence.createEntityManagerFactory("PracticoTSI2");
			
			em = emf.createEntityManager();
			
			tx = em.getTransaction();
			tx.begin();
			em.persist(r);
			em.persist(user);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
		
		
	}

}

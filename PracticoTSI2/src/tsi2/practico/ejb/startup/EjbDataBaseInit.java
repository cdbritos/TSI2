package tsi2.practico.ejb.startup;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tsi2.practico.constants.Constants;
import tsi2.practico.entity.Role;
import tsi2.practico.entity.User;

@Startup
@Singleton
public class EjbDataBaseInit {
	
	@PersistenceContext(unitName=Constants.PERSISTENCE_UNIT_NAME)
	private EntityManager em;
	
	@PostConstruct
	public void init(){

		try {
			for (int i = 0; i< 10; i++){
				
				Role r = new Role("Role" + i, "ADMIN" + i);
				User user = new User("user" + i, "pass" + i, "nombre"+i, "apellido"+i, "mail"+i+"@gmail.com", r);
				em.persist(r);
				em.persist(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
}

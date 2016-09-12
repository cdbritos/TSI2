package tsi2.practico.services.impl;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tsi2.practico.constants.Constants;
import tsi2.practico.entity.User;
import tsi2.practico.services.IServicesSoap;
import tsi2.practico.services.constants.ServiceError;
import tsi2.practico.services.exception.ServiceException;
import tsi2.practico.services.input.AbstractABMCInput;
import tsi2.practico.services.input.LoginInput;
import tsi2.practico.services.input.LogoutInput;
import tsi2.practico.services.input.UserInput;
import tsi2.practico.services.output.AbstractABMCOutput;
import tsi2.practico.services.output.LoginOutput;
import tsi2.practico.services.output.LogoutOutput;
import tsi2.practico.services.output.UserOutput;

@WebService(endpointInterface = "tsi2.practico.services.IServicesSoap")
@Stateless
public class ServicesPractico implements IServicesSoap {

	@PersistenceContext(unitName=Constants.PERSISTENCE_UNIT_NAME)
	private EntityManager em;
	
	@Override
	public LoginOutput login(LoginInput input) throws ServiceException {
		LoginOutput output = new LoginOutput();

		User usuario = em.find(User.class, input.getUsername());
		if (usuario == null)
			throw new ServiceException(ServiceError.ENTITY_NOT_FOUND, User.class);
		
		output.setUsuario(usuario);
		
		output.setOK();
		
		return output;
	}

	@Override
	public LogoutOutput logout(LogoutInput input) throws ServiceException {
		System.out.println("LOGOUT");
		return null;
	}

	@Override
	public UserOutput manipulacionUsuario(UserInput input) throws ServiceException, InstantiationException, IllegalAccessException {

		if (input.getAccion() == null)
			throw new ServiceException(ServiceError.EMPTY_ACTION, input);
		
		UserOutput output = new UserOutput();
		
		doService(input, output);
		
		return output;
		
	}

	private void doService(AbstractABMCInput input, AbstractABMCOutput output) throws ServiceException, InstantiationException, IllegalAccessException{
		
		switch (input.getAccion()) {
		case Constants.ALTA:
			em.persist(input.getEntity());
			break;
		case Constants.BAJA:
			Object entidadAremover = em.find(input.getInputClass(), input.getPrimaryKey());
			em.remove(entidadAremover);
			break;
		case Constants.MODIFICACION:
			System.out.println("MODIFICACION");
			break;
		case Constants.CONSULTA:
			output.setEntity(em.find(input.getInputClass(), input.getPrimaryKey()));
			break;
		default:
			throw new ServiceException(ServiceError.INVALID_ACTION, input);
		}
		
	}

	
	
}

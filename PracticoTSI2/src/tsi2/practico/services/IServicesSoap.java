package tsi2.practico.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import tsi2.practico.constants.Constants;
import tsi2.practico.services.exception.ServiceException;
import tsi2.practico.services.input.LoginInput;
import tsi2.practico.services.input.LogoutInput;
import tsi2.practico.services.input.UserInput;
import tsi2.practico.services.output.LoginOutput;
import tsi2.practico.services.output.LogoutOutput;
import tsi2.practico.services.output.UserOutput;

@WebService
public interface IServicesSoap {
	
	@WebMethod(action=Constants.LOGIN_SERVICE,operationName=Constants.LOGIN_SERVICE)
	@WebResult(name=Constants.OUTPUT_SERVICE)
	public LoginOutput login(@WebParam(name=Constants.INPUT_SERVICE) LoginInput input) throws ServiceException;
	
	@WebMethod(action=Constants.LOGOUT_SERVICE,operationName=Constants.LOGOUT_SERVICE)
	@WebResult(name=Constants.OUTPUT_SERVICE)
	public LogoutOutput logout(@WebParam(name=Constants.INPUT_SERVICE) LogoutInput input) throws ServiceException;
	
	@WebMethod(action=Constants.ABMC_SERVICE_USER,operationName=Constants.ABMC_SERVICE_USER)
	@WebResult(name=Constants.OUTPUT_SERVICE)
	public UserOutput manipulacionUsuario(@WebParam(name=Constants.INPUT_SERVICE) UserInput input) throws ServiceException, InstantiationException, IllegalAccessException;
	
	
}

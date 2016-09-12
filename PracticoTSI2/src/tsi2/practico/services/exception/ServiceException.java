package tsi2.practico.services.exception;

import javax.xml.ws.WebFault;

import tsi2.practico.services.constants.ServiceError;
import tsi2.practico.services.input.AbstractABMCInput;

@WebFault(name="ServiceFault")
public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = -4539986325610939157L;
	private ServiceFault serviceFault;
	
	
	public ServiceException(ServiceError enumError) {
		super(enumError.description);
		setServiceFault(enumError.name(),enumError.description);
	}

	public ServiceException(ServiceError enumError, Class<?> clazz) {
		super(enumError.description + " " + clazz.getCanonicalName());
		setServiceFault(enumError.name(),enumError.description + " " + clazz.getName());
	}
	
	public ServiceException() {
		super();
	}

	public ServiceException(ServiceError enumError, AbstractABMCInput input) {
		this(enumError,input.getInputClass());
	}

	public ServiceFault getServiceFault() {
		return serviceFault;
	}

	public void setServiceFault(ServiceFault serviceFault) {
		this.serviceFault = serviceFault;
	}
	
	public void setServiceFault(String errorCode, String errorDescription) {
		this.serviceFault = new ServiceFault();
		this.serviceFault.setFaultCode(errorCode); 
		this.serviceFault.setFaultString(errorDescription);
	}
	
}

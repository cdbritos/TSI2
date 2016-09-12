package tsi2.practico.services.exception;

public class ServiceFault {

	private String faultString;
	private String faultCode;
	
	public String getFaultString() {
		return faultString;
	}
	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
	public String getFaultCode() {
		return faultCode;
	}
	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}
	
	
}

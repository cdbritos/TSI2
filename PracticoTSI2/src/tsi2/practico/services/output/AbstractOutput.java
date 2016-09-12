package tsi2.practico.services.output;

import java.io.Serializable;

import tsi2.practico.constants.Constants;

public abstract class AbstractOutput implements Serializable{
	
	private static final long serialVersionUID = -9082511863600085911L;
	
	protected String errorCode;
	protected String errorDescription;
	
	public void setOK(){
		errorCode = Constants.OK_CODE_SERVICE;
		errorDescription = Constants.OK_DESCRIPTION_SERVICE;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

}

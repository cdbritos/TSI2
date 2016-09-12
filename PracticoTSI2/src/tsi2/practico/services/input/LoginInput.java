package tsi2.practico.services.input;

import java.io.Serializable;

public class LoginInput implements Serializable{

	private static final long serialVersionUID = 1293662800396163470L;
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

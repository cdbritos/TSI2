package tsi2.practico.services.output;

import java.io.Serializable;

import tsi2.practico.entity.User;

public class LoginOutput extends AbstractOutput implements Serializable {

	private static final long serialVersionUID = 3237499430258656776L;
	
	private User usuario;

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	
}

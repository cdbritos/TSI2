package tsi2.practico.services.input;

import tsi2.practico.entity.User;

public class UserInput extends AbstractABMCInput {

	private static final long serialVersionUID = -8645013432109359199L;
	
	private User usuario;

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

	@Override
	public Class<?> getInputClass() {
		return User.class;
	}

	@Override
	public Object getEntity() {
		return usuario;
	}

	@Override
	public Object getPrimaryKey() {
		return usuario.getUsername();
	}
	

}

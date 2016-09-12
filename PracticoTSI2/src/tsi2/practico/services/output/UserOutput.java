package tsi2.practico.services.output;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import tsi2.practico.entity.User;

public class UserOutput extends AbstractABMCOutput implements Serializable {

	private static final long serialVersionUID = 3237499430258656776L;
	
	private List<User> usuarios;

	public List<User> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<User> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public void setEntity(Object entidad) {
		User entity = (User) entidad;
		usuarios = new ArrayList<User>();
		usuarios.add(entity);
	}

		
}

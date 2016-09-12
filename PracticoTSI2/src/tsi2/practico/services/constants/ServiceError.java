package tsi2.practico.services.constants;

public enum ServiceError {
	
	ENTITY_NOT_FOUND("No se encontro la entidad"),
	EMPTY_ACTION("Accion Vacia para manipulacion de la entidad"),
	INVALID_ACTION("Accion invalida para manipulacion de la entidad");
	
	public String description;

	private ServiceError(String description) {
		this.description = description;
	}
}

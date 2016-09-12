package tsi2.practico.constants;

public interface Constants {

	// JPA COSNTANTS
	
	public static final String CATALOG = "public";
	public static final String SCHEMA = "practico";
	public static final String PERSISTENCE_UNIT_NAME="UP_PracticoTSI2";
	
	// WEBSERVICES CONSTANTS
	public static final String INPUT_SERVICE = "input";
	public static final String OUTPUT_SERVICE = "output";
	public static final String LOGOUT_SERVICE = "logout";
	public static final String LOGIN_SERVICE = "login";
	public static final String ABMC_SERVICE_USER = "abmcUsuario";
	
	
	// SERVICE CONSTANTS
	public static final String  OK_CODE_SERVICE = "0";
	public static final String  OK_DESCRIPTION_SERVICE = "Servicio finalizado correctamente";
	
	// SERVICE ACTIONS
	public static final String  ALTA = "A";
	public static final String  BAJA = "B";
	public static final String  MODIFICACION = "M";
	public static final String  CONSULTA = "C";
}


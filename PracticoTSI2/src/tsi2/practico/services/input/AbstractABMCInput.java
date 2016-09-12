package tsi2.practico.services.input;

public abstract class AbstractABMCInput extends AbstractInput {

	private static final long serialVersionUID = 2706113366620444940L;

	protected String accion;

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public abstract Class<?> getInputClass();
	public abstract Object getEntity();

	public abstract Object getPrimaryKey();

}

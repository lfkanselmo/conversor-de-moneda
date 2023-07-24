package entidades;

public class Moneda {
	private Double dinero;
	private String tipoMoneda;
	
	public Moneda(Double dinero, String tipoMoneda) {
		this.dinero = dinero;
		this.tipoMoneda = tipoMoneda;
	}

	public Double getDinero() {
		return dinero;
	}

	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	
	
	
	
}

package entidades;

public class Yen extends Moneda {

	@Override
	public double convertirA_Dolares(double valor) {
		return valor * 0.007072;
	}

	@Override
	public double convertirA_Euros(double valor) {
		return valor * 0.006387;
	}

	@Override
	public double convertirA_Libras(double valor) {
		return valor * 0.005513;
	}

	@Override
	public double convertirA_Yen(double valor) {
		return valor;
	}

	@Override
	public double convertirA_Won(double valor) {
		return valor * 9.0667;
	}

	@Override
	public double convertirA_PesoCol(double valor) {
		return valor * 27.9526;
	}

}

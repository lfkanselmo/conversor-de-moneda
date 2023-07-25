package entidades;

public class Peso extends Moneda{

	@Override
	public double convertirA_Dolares(double valor) {
		return valor * 0.000253;
	}

	@Override
	public double convertirA_Euros(double valor) {
		return valor * 0.000229;
	}

	@Override
	public double convertirA_Libras(double valor) {
		return valor * 0.000197;
	}

	@Override
	public double convertirA_Yen(double valor) {
		
		return valor * 0.0358;
	}

	@Override
	public double convertirA_Won(double valor) {
		return valor * 0.3244;
	}

	@Override
	public double convertirA_PesoCol(double valor) {
		return valor;
	}

}

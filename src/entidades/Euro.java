package entidades;

public class Euro extends Moneda {

	@Override
	public double convertirA_Dolares(double valor) {
		return valor * 1.1072;
	}

	@Override
	public double convertirA_Euros(double valor) {
		return valor;
	}

	@Override
	public double convertirA_Libras(double valor) {
		return valor * 0.8631;
	}

	@Override
	public double convertirA_Yen(double valor) {
		return valor * 156.58;
	}

	@Override
	public double convertirA_Won(double valor) {
		return 1418.87;
	}

	@Override
	public double convertirA_PesoCol(double valor) {
		return valor * 4376.2846;
	}

}

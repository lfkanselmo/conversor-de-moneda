package entidades;

public class Won extends Moneda {

	@Override
	public double convertirA_Dolares(double valor) {
		return valor * 0.00078;
	}

	@Override
	public double convertirA_Euros(double valor) {
		return valor * 0.000705;
	}

	@Override
	public double convertirA_Libras(double valor) {
		return valor * 0.000608;
	}

	@Override
	public double convertirA_Yen(double valor) {
		return valor * 0.1103;
	}

	@Override
	public double convertirA_Won(double valor) {
		return valor;
	}

	@Override
	public double convertirA_PesoCol(double valor) {
		return valor * 3.083;
	}

}

package entidades;

public class Dolar extends Moneda {

	@Override
	public double convertirA_Dolares(double valor) {
		return valor;
	}

	@Override
	public double convertirA_Euros(double valor) {
		return valor * 0.90;
	}

	@Override
	public double convertirA_Libras(double valor) {
		return valor * 0.77;
	}

	@Override
	public double convertirA_Yen(double valor) {
		return valor * 141.39;
	}

	@Override
	public double convertirA_Won(double valor) {
		return valor * 1281.05;
	}

	@Override
	public double convertirA_PesoCol(double valor) {
		return valor * 3951;
	}

}

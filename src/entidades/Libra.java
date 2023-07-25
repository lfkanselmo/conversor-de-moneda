package entidades;

public class Libra extends Moneda {

	@Override
	public double convertirA_Dolares(double valor) {
		return valor * 1.2828;
	}

	@Override
	public double convertirA_Euros(double valor) {
		return valor * 1.1586;
	}

	@Override
	public double convertirA_Libras(double valor) {
		return valor;
	}

	@Override
	public double convertirA_Yen(double valor) {
		return valor * 181.41;
	}

	@Override
	public double convertirA_Won(double valor) {
		return valor * 1644.6154;
	}

	@Override
	public double convertirA_PesoCol(double valor) {
		return valor * 5070.3557;
	}

}

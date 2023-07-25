package conversores;

import entidades.*;

public class ConversorMonedas {
	private Moneda moneda;

	public double convertir(String monedaEntrada, String monedaSalida, double dinero) {

		switch (monedaEntrada) {
		case "peso":
			moneda = new Peso();
			break;
		case "dolar":
			moneda = new Dolar();
			break;
		case "euro":
			moneda = new Euro();
			break;
		case "yen":
			moneda = new Yen();
			break;
		case "won":
			moneda = new Won();
			break;
		case "libra":
			moneda = new Libra();
			break;
		}

		switch (monedaSalida) {
		case "peso":
			return moneda.convertirA_PesoCol(dinero);

		case "dolar":
			return moneda.convertirA_Dolares(dinero);

		case "euro":
			return moneda.convertirA_Euros(dinero);

		case "libra":
			return moneda.convertirA_Libras(dinero);

		case "yen":
			return moneda.convertirA_Yen(dinero);

		case "won":
			return moneda.convertirA_Won(dinero);
		}

		return 0.0;
	}
}

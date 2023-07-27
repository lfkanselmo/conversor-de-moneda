package entornos;

import javax.swing.JOptionPane;

import conversores.ConversorMonedas;

public class Funcion {

	ConversorMonedas conversor = new ConversorMonedas();
	double resultado;
	Object[] monedas = new Object[] { "peso", "dolar", "euro", "libra", "yen", "won" };

	public void procesoConversion() {

		String monedaEntrada = " ";
		String monedaSalida = " ";
		String input = " ";

		try {
			monedaEntrada = (JOptionPane.showInputDialog(null, "Elije el tipo de moneda de entrada ", "Monedas",
					JOptionPane.PLAIN_MESSAGE, null, monedas, "Seleccion")).toString();

			monedaSalida = (JOptionPane.showInputDialog(null, "Elije el tipo de moneda de salida ", "Monedas",
					JOptionPane.PLAIN_MESSAGE, null, monedas, "Seleccion")).toString();

			input = (JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ")).toString();

		} catch (NullPointerException e) {
			input = "0";
		}

		if (validador(input)) {
			resultado = conversor.convertir(monedaEntrada, monedaSalida, Double.valueOf(input));
			JOptionPane.showMessageDialog(null,
					Double.valueOf(input) + " " + monedaEntrada + " equivalen a " + resultado + " " + monedaSalida);
		} else {
			if (input != "0") {
				JOptionPane.showMessageDialog(null, "Valor inválido");
			} else {
				JOptionPane.showMessageDialog(null, "Cancelado");
			}

		}
	}

	// Función de validación de dinero ingresado
	public boolean validador(String input) {

		try {
			double dinero = Double.valueOf(input);
			if (dinero > 0) {
				return true;
			}

			return false;

		} catch (NumberFormatException e) {
			return false;
		}
	}

}

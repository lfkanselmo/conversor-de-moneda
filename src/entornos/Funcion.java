package entornos;

import javax.swing.*;

import conversores.ConversorMonedas;

public class Funcion {

	ConversorMonedas conversor = new ConversorMonedas();
	double resultado;
	Object[] monedas = new Object[] { "peso", "dolar", "euro", "libra", "yen", "won" };

	public void procesoConversion() {
		String monedaEntrada = (JOptionPane.showInputDialog(null, "Elije el tipo de moneda de entrada ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, monedas, "Seleccion")).toString();

		String monedaSalida = (JOptionPane.showInputDialog(null, "Elije el tipo de moneda de salida ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, monedas, "Seleccion")).toString();

		String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");

		

		if (validador(input)) {
			resultado = conversor.convertir(monedaEntrada, monedaSalida, Double.valueOf(input));
			JOptionPane.showMessageDialog(null,
					Double.valueOf(input) + " " + monedaEntrada + " equivalen a " + resultado + " " + monedaSalida);
		} else {
			JOptionPane.showMessageDialog(null, "Valor inválido");

		}
	}

	
	//Funcioón de validación de dinero ingresado
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

package inicio;

import javax.swing.*;

import entornos.Funcion;

public class Inicio {

	public static void main(String[] args) {
		Funcion convertidorMonedas = new Funcion();
		Object[] menu = { "Convertir moneda", "Salir" };
		boolean exit = false;

		while (exit == false) {

			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción del menu ", "Menú",
					JOptionPane.QUESTION_MESSAGE, null, menu, "seleccion")).toString();
			
			switch(opciones) {
			case "Convertir moneda":
				convertidorMonedas.procesoConversion();
				break;
			case "Salir":
				JOptionPane.showMessageDialog(null, "Programa terminado. Adios");
				exit = true;
				break;
			}
		}
	}

}

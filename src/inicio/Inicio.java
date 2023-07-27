package inicio;

import javax.swing.JOptionPane;

import entornos.Funcion;

public class Inicio {

	public static void main(String[] args) {
		Funcion convertidorMonedas = new Funcion();
		Object[] menu = { "Convertir moneda", "Salir" };
		boolean exit = false;
		String opciones;

		while (exit == false) {

			try {
				opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción del menú ", "Menú",
						JOptionPane.QUESTION_MESSAGE, null, menu, "seleccion")).toString();
			} catch (NullPointerException e) {
				opciones = "Cancelar";
			}

			switch (opciones) {
			case "Convertir moneda":
				convertidorMonedas.procesoConversion();
				break;
			case "Salir":
				exit = salir();
				break;

			case "Cancelar":
				exit = salir();
				break;

			}

			if (exit == false) {
				int opt = JOptionPane.showConfirmDialog(null, "¿Desea continuar haciendo conversiones? ");

				switch (opt) {
				case JOptionPane.NO_OPTION:
				case JOptionPane.CANCEL_OPTION:
					exit = salir();
					break;
				case JOptionPane.YES_OPTION:
					break;
				}
			}
		}
	}

	// Metodo para salir
	public static boolean salir() {
		JOptionPane.showMessageDialog(null, "Programa terminado. Adios");
		return true;
	}

}

package tarea03;

import utilidades.Entrada;

public class Principal {
	private String reyBlanco, reyNegro;

	public Principal() {

	}

	public static void main(String[] args) {

		String color = "";
		boolean salir = false;
		int movimiento;
		int movimientoUsuario;

		do {
			System.out.println("Introduzca blanco/negro para el color del rey");
			color = Entrada.cadena();
		} while (color == "blanco" || color == "negro");

		if (color.equals("blanco")) {

			Principal reyBlanco;
			reyBlanco = new Principal();
			System.out.println("Su rey es blanco");

		} else if (color.equals("negro")) {

			Principal reyNegro = new Principal();
			System.out.println("Su rey es negro");
		}

		do {
			System.out.println("TECLEA UNA DIRECCION");
			System.out.println("Solo números entre 1 y 8");
			System.out.println("Pulsa 9 para salir");
			
			System.out.println("1: NORTE, 2: NORESTE, 3: ESTE, 4: SURESTE, 5: SUR, 6: SUROESTE, "
					+ "7: OESTE, 8: NOROESTE y 9: SALIR");			
			movimientoUsuario = Entrada.entero();
			movimiento = movimientoUsuario;

			switch (movimiento) {
			case 1:
				System.out.println("HAS MOVIDO AL REY UNA CASILLA AL NORTE");
				break;
			case 2:
				System.out.println("HAS MOVIDO AL REY UNA CASILLA AL NORESTE");
				break;
			case 3:
				System.out.println("HAS MOVIDO AL REY UNA CASILLA AL ESTE");
				break;
			case 4:
				System.out.println("HAS MOVIDO AL REY UNA CASILLA AL SURESTE");
				break;
			case 5:
				System.out.println("HAS MOVIDO AL REY UNA CASILLA AL SUR");
				break;
			case 6:
				System.out.println("HAS MOVIDO AL REY UNA CASILLA AL SUROESTE");
				break;
			case 7:
				System.out.println("HAS MOVIDO AL REY UNA CASILLA AL OESTE");
				break;
			case 8:
				System.out.println("HAS MOVIDO AL REY UNA CASILLA AL NOROESTE");
				break;
			case 9:
				System.out.println("HAS SELECCIONADO SALIR");
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 9");
			}

		} while (!salir);

	}

}

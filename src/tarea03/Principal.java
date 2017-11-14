package tarea03;

import utilidades.Entrada;

public class Principal {

	public Principal() {

	}

	public static void main(String[] args) {

		int color = 1;
		boolean salir = false;
		int movimiento;
		Posicion nuevaPosicion;
		Rey rey = null;

		do {
			System.out.println("Introduzca 1=blanco/2=negro para el color del rey");
			color = Entrada.entero();
		} while (color != 1 && color != 2);

		if (color == 1) {

			rey = new Rey(Color.BLANCO);
			System.out.println("Su rey es blanco");

		} else if (color == 2) {

			rey = new Rey(Color.NEGRO);
			System.out.println("Su rey es negro");
		}
		Posicion posicion = rey.getPosicion();

		do {
			int posfila = posicion.getFila();
			int poscolumna = posicion.getColumna();

			System.out.println("TECLEA UNA DIRECCION");

			System.out.println("1: NORTE, 2: NORESTE, 3: ESTE, 4: SURESTE, 5: SUR, 6: SUROESTE, "
					+ "7: OESTE, 8: NOROESTE y 9: SALIR");
			movimiento = Entrada.entero();

			switch (movimiento) {
			case 1:
				System.out.println("Una casilla dirección NORTE");
				rey.mueve(Direccion.NORTE);
				System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
				break;
			case 2:
				System.out.println("Una casilla dirección NORESTE");
				rey.mueve(Direccion.NORESTE);
				System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
				break;
			case 3:
				System.out.println("Una casilla dirección ESTE");
				rey.mueve(Direccion.ESTE);
				System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
				break;
			case 4:
				System.out.println("Una casilla dirección SURESTE");
				rey.mueve(Direccion.SURESTE);
				System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
				break;
			case 5:
				System.out.println("Una casilla dirección SUR");
				rey.mueve(Direccion.SUR);
				System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
				break;
			case 6:
				System.out.println("Una casilla dirección SUROESTE");
				rey.mueve(Direccion.SUROESTE);
				System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
				break;
			case 7:
				System.out.println("Una casilla dirección OESTE");
				rey.mueve(Direccion.OESTE);
				System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
				break;
			case 8:
				System.out.println("Una casilla dirección NOROESTE");
				rey.mueve(Direccion.NOROESTE);
				System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
				break;
			case 9:
				System.out.println("HAS SELECCIONADO SALIR");
				System.out.println("La última posición del Rey " + rey.getColor() + " es : " + rey.getPosicion());
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 9");
			}

		} while (!salir);

	}

}

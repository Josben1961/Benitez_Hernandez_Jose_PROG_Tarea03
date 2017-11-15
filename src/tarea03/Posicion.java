package tarea03;

public class Posicion {

	// Accesibles solo desde dentro de la clase
	// Únicas y compartida por los objetos de la clase

	private int fila;
	private char columna;

	public Posicion(int fila, char columna) {

		this.fila = fila;
		this.columna = columna;

		if (fila > 0 && fila < 9) {
			this.fila = fila;
		} else {
			this.fila = 1;
			System.out.println("Error, la fila introducida no es correcta");
		}
		if (columna >= 'a' && columna <= 'h') {
			this.columna = columna;
		} else {
			this.columna = 'a';
			System.out.println("Error, la columna introducida no es correcta");
		}
		// Métodos getter
	}

	public int getFila() {
		return fila;
	}

	public char getColumna() {
		return columna;
	}

	// Métodos setter
	public void setFila(int fila) {

		if (fila > 0 && fila < 9) {
			this.fila = fila;
		} else {
			this.fila = 1;
			System.out.println("Error, la fila introducida no es correcta");
		}

	}

	public void setColumna(char columna) {

		if (columna >= 'a' && columna <= 'h') {
			this.columna = columna;
		} else {
			this.columna = 'a';

			System.out.println("Error, la fila introducida no es correcta");
		}

	}

	// Creamos el método toString
	public String toString() {

		String mensaje = "Fila: " + fila + "  " + " Columna " + columna;

		return mensaje;
	}

}

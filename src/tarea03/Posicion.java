package tarea03;

public class Posicion {

	// Accesibles solo desde dentro de la clase
	// Únicas y compartida por los objetos de la clase

	private static int fila;
	private static char columna;

	public Posicion(int fila, char columna) {

		this.fila = fila;
		this.columna = columna;
		
		if(fila>0 && fila<9) {
			this.fila=fila;
		}else {
			this.fila=1;
		}
		
		if(columna>='a' && columna<='h') {
			this.columna=columna;
		}else {
			this.columna='a';
		}

	}

}

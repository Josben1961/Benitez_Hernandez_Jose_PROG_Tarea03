package tarea03;

public class Posicion {

	// Accesibles solo desde dentro de la clase
	// �nicas y compartida por los objetos de la clase

	private static int fila;
	private static char columna;

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
		// M�todos getter
	}

	public int getFila() {
		return fila;
	}

	public char getColumna() {
		return columna;
	}

	// M�todos setter
	public void setFila(int fila) {

		if (fila > 0 && fila < 9) {
			this.fila = fila;
		} else {
			this.fila = 1;
		}
		System.out.println("Error, la fila introducida no es correcta");
	}

	public void setColumna(char columna) {

		if (columna > 'a' && columna < 'h') {
			this.fila = fila;
		} else {
			this.fila = 1;

			System.out.println("Error, la fila introducida no es correcta");
		}

	}
	public String toString (){
		
        String mensaje="La fila es "+fila+ " y " + " la columna es" + columna;
                
        return mensaje;
    }

}

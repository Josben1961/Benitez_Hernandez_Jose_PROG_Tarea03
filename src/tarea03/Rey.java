package tarea03;

public class Rey {
	private Color color;
	private Posicion posicion;

	// Constructor por defecto
	public Rey() {

		this.color = Color.BLANCO;
		this.posicion = new Posicion(1, 'e');
	}

	// Constructor con el parámetro color
	public Rey(Color color) {
		this.color = color;
		switch (color) {
		case BLANCO:
			posicion = new Posicion(1, 'e');
			break;
		case NEGRO:
			posicion = new Posicion(8, 'e');
			break;
		}

	}

	public Color getColor() {
		return color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	@Override
	public String toString() {
		return "Rey [color=" + color + ", posicion=" + posicion + "]";
	}

	public void mueve(Direccion nuevaDireccion) {
		int fila = posicion.getFila();
		int columna = posicion.getColumna();

		if (fila == 1 && nuevaDireccion == nuevaDireccion.SUR
				|| nuevaDireccion == nuevaDireccion.SURESTE && nuevaDireccion == nuevaDireccion.SUROESTE) {

			System.out.println("Movimiento no permitido");
		}
		if (fila == 8 && nuevaDireccion == nuevaDireccion.NORTE
				|| nuevaDireccion == nuevaDireccion.NORESTE && nuevaDireccion == nuevaDireccion.NOROESTE) {

			System.out.println("Movimiento no permitido");
		}
		if (color == Color.BLANCO) {
			switch (nuevaDireccion) {
			case NORTE:
				nuevaDireccion = Direccion.NORTE;
				posicion.setFila(fila + 1);
				posicion.setColumna((char) (columna));
				break;
			case NORESTE:
				nuevaDireccion = Direccion.NORESTE;
				posicion.setFila(fila + 1);
				posicion.setColumna((char) (columna + 1));
				break;
			case ESTE:
				nuevaDireccion = Direccion.ESTE;
				posicion.setFila(fila);
				posicion.setColumna((char) (columna + 1));
				break;
			case SURESTE:
				nuevaDireccion = Direccion.SURESTE;
				posicion.setFila(fila - 1);
				posicion.setColumna((char) (columna + 1));
				break;
			case SUR:
				nuevaDireccion = Direccion.SUR;
				posicion.setFila(fila - 1);
				posicion.setColumna((char) (columna));
				break;
			case SUROESTE:
				nuevaDireccion = Direccion.SUROESTE;
				posicion.setFila(fila - 1);
				posicion.setColumna((char) (columna - 1));
				break;
			case OESTE:
				nuevaDireccion = Direccion.OESTE;
				posicion.setFila(fila);
				posicion.setColumna((char) (columna - 1));
				break;
			case NOROESTE:
				nuevaDireccion = Direccion.NOROESTE;
				posicion.setFila(fila + 1);
				posicion.setColumna((char) (columna - 1));
				break;
			}
		}
		if (color == Color.NEGRO) {
			switch (nuevaDireccion) {
			case NORTE:
				nuevaDireccion = Direccion.NORTE;
				posicion.setFila(fila + 1);
				posicion.setColumna((char) (columna));
				break;
			case NORESTE:
				nuevaDireccion = Direccion.NORESTE;
				posicion.setFila(fila + 1);
				posicion.setColumna((char) (columna + 1));
				break;
			case ESTE:
				nuevaDireccion = Direccion.ESTE;
				posicion.setFila(fila);
				posicion.setColumna((char) (columna + 1));
				break;
			case SURESTE:
				nuevaDireccion = Direccion.SURESTE;
				posicion.setFila(fila - 1);
				posicion.setColumna((char) (columna + 1));
				break;
			case SUR:
				nuevaDireccion = Direccion.SUR;
				posicion.setFila(fila - 1);
				posicion.setColumna((char) (columna));
				break;
			case SUROESTE:
				nuevaDireccion = Direccion.SUROESTE;
				posicion.setFila(fila - 1);
				posicion.setColumna((char) (columna - 1));
				break;
			case OESTE:
				nuevaDireccion = Direccion.OESTE;
				posicion.setFila(fila);
				posicion.setColumna((char) (columna - 1));
				break;
			case NOROESTE:
				nuevaDireccion = Direccion.NOROESTE;
				posicion.setFila(fila + 1);
				posicion.setColumna((char) (columna - 1));
				break;
			}
		}

	}

}

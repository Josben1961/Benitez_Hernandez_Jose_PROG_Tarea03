package tarea03;

public class Rey {
	private Color color;
	private Posicion posicion;
	private Direccion nuevaDireccion;

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

	// Constructor por defecto
	public Rey() {

		color = Color.BLANCO;

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Rey [color=" + color + ", posicion=" + posicion + "]";
	}

	public void mueve(Direccion nuevaDireccion) {
		int fila = posicion.getFila();
		int columna = posicion.getColumna();

		this.nuevaDireccion = nuevaDireccion;
		if (fila == 1 && nuevaDireccion == nuevaDireccion.SUR
				|| nuevaDireccion == nuevaDireccion.SURESTE && nuevaDireccion == nuevaDireccion.SUROESTE) {

			System.out.println("Movimiento no permitido");
		}
		switch (nuevaDireccion) {
		case NORTE:
			nuevaDireccion = Direccion.NORTE;
			posicion.setFila(fila + 1);
			posicion.setColumna((char) (columna + 1));
			break;
		case NORESTE:
			nuevaDireccion = Direccion.NORESTE;
			posicion.setFila(fila + 1);
			posicion.setColumna((char) (columna + 1));
			break;
		case ESTE:
			nuevaDireccion = Direccion.ESTE;
			posicion.setColumna((char) (columna + 1));
			break;
		case SURESTE:
			nuevaDireccion = Direccion.SURESTE;
			posicion.setFila(fila - 1);
			posicion.setColumna((char) (columna - 1));
			break;
		case SUR:
			nuevaDireccion = Direccion.SUR;
			posicion.setFila(fila - 1);

			break;
		case SUROESTE:
			nuevaDireccion = Direccion.SUROESTE;
			posicion.setFila(fila - 1);
			posicion.setColumna((char) (columna - 1));
			break;
		case OESTE:
			nuevaDireccion = Direccion.OESTE;
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

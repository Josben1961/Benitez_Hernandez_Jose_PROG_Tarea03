package tarea03;

public class Rey {
	private Color color;
	private Posicion posicionFila;
	private Posicion posicionColumna;
	private Posicion posicion;

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
		posicionFila.setFila(1);
		posicionColumna.setColumna('e');

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
		return "Rey [getColor()=" + getColor() + ", getPosicion()=" + getPosicion() + "]";
	}
	

}

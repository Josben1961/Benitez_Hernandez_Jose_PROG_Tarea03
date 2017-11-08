package tarea03;

public class Rey {
	private Color color;
	private Posicion posicion;

	// Constructor con el par�metro color
	public Rey(Color color) {

		this.color = color;
	}

	// Constructor por defecto
	public Rey() {

		color = Color.BLANCO;

	}
	// M�todos getters

	public Color getColor() {
		return color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	// M�todo toString

	public String toString() {
		return "Rey [color=" + color + ", posicion=" + posicion + "]";
	}

}

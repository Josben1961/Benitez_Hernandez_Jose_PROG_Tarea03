package tarea03;

public class Rey {
	private Color color;
	private Posicion posicion;

	// Constructor con el parámetro color
	public Rey(Color color) {

		this.color = color;
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
	

}

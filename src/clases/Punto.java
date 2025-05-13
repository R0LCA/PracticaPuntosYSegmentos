package clases;
/**
 * Clase Punto
 */
public class Punto {
	private int x;
	private int y;
	
	/**
	 * Crea un Punto con valores por defecto (0, 0)
	 */
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Crea un Punto con valores especificos introducidos por el usuario
	 * @param x Coordenada en metros
	 * @param y Coordenada en metros
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int newX) {
		this.x = newX;
	}
	
	public void setY(int newY) {
		this.y = newY;
	}
	
	@Override
	public String toString() {
		String mensaje = "(";
		mensaje += String.valueOf(this.x);
		mensaje += ", ";
		mensaje += String.valueOf(this.y);
		mensaje += ")";
		
		return mensaje;
	}

}

package clases;
/**
 * Clase Segmento
 */
public class Segmento {
	private Punto a;
	private Punto b;
	
	/**
	 * Crea un Segmento con valores por defecto. Un punto (0, 0) y otro (1, 1).
	 */
	public Segmento() {
		this.a = new Punto(0, 0);
		this.b = new Punto(1, 1);
	}
	
	/**
	 * Crea un Segmento con valores (Puntos) especificados por el usuario.
	 * @param a objeto de clase Punto
	 * @param b objeto de clase Punto
	 */
	public Segmento(Punto a, Punto b) throws IllegalArgumentException{
		if(a.getX() == b.getX() && a.getY() == b.getY()) {
			throw new IllegalArgumentException ("Los dos puntos son iguales");
		}
		else {
			this.a = a;
			this.b = b;
		}
	}
	
	public Punto getA() {
		return this.a;
	}
	
	public Punto getB() {
		return this.b;
	}
	
	public void setA(Punto newA) {
		this.a = newA;
	}
	
	public void setB(Punto newB) {
		this.b = newB;
	}
	
	
	@Override
	public String toString() {
		String mensaje = "[";
		mensaje += this.a.toString();
		mensaje += ",";
		mensaje += this.b.toString();
		mensaje += "]";
		
		return mensaje;
	}
	
	/**
	 * Metodo para calcular la distancia de un segmento entre sus dos puntos.
	 * @return distancia del segmento en metros
	 */
	public double distancia() {
		double distancia;
		
		distancia = Math.sqrt( Math.pow( ( this.b.getX() - this.a.getX() ), 2) +  Math.pow( ( this.b.getY() - this.a.getY() ), 2));
	
		return distancia;
	}
	
}

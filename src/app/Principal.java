package app;

import clases.Punto;
import clases.Segmento;

public class Principal {
	public static void main(String[] args) {
		// Puntos
			Punto p1 = new Punto((int) (Math.random() * 11), (int) (Math.random() * 11));
			Punto p2 = new Punto((int) (Math.random() * 11), (int) (Math.random() * 11));
			Punto p3 = new Punto((int) (Math.random() * 11), (int) (Math.random() * 11));
			Punto p4 = new Punto((int) (Math.random() * 11), (int) (Math.random() * 11));

			// Segmentos
			Segmento s1 = new Segmento(p1, p2);
			Segmento s2 = new Segmento(p3, p4);
			
			
			
			// Calculo de las distancias de los segmentos
			// s1.distancia();
			// s2.distancia();
			double d1 = s1.distancia();
			double d2 = s2.distancia();
	}
}


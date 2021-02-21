/**
 * 
 * 
 * @author Adrian Bravo Argumanez
 * @version 1.2
 *
 */

public class Rectangulo_ABA extends FiguraGeometrica_ABA {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase
	 * 
	 * @param tipoFigura indica que es un rectangulo
	 * @param lG tamaño del lado grande
	 * @param lP tamaño del lado pequeño
	 */
	
	public Rectangulo_ABA(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Calcula el area del rectangulo
	 * 
	 * @return devuelve el area del rectangulo
	 */

	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el perimetro del rectangulo
	 * 
	 * @return devuelve el perimetro del rectangulo
	 */
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}

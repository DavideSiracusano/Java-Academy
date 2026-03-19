package geometria;

public class Cerchio extends Figura {

	double raggio;
	final double PI_Greco = 3.14;

	public Cerchio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public void calcolaArea() {
		double area = PI_Greco * raggio * raggio;
		System.out.println("Area Cerchio: " + area);

	}

	@Override
	public void calcolaPerimetro() {
		double perimetro = 2 * PI_Greco * raggio;
		System.out.println("Perimetro Cerchio: " + perimetro);
	}

}

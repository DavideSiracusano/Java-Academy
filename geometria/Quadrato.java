package geometria;

public class Quadrato extends Figura {

	double lato;

	public Quadrato(double lato) {
		this.lato = lato;
	}

	@Override
	public void calcolaArea() {
		System.out.println("Area Quadrato: " + (lato * lato));
	}

	@Override
	public void calcolaPerimetro() {
		System.out.println("Perimetro Quadrato: " + (4 * lato));
	}

}

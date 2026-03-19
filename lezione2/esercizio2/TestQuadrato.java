package lezione2.esercizio2;

public class TestQuadrato {
	
	public static void main(String[] args) {
		
		//calcolare area e perimetro di un quadrato con lato 5cm
		
		Quadrato quadrato1 = new Quadrato(5);
		
		System.out.println(quadrato1.calcolaArea());
		System.out.println(quadrato1.calcolaPerimetro());

	}

}

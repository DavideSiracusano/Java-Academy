package lezione4.esercizio7;

public class Somma {
	
	public static void main(String [] args) {
		
		int numero1 = 20;
		int numero2 = 10;
		int somma = numero1 + numero2;
		
		if(somma > 100) {
			System.out.println("La somma tra " + numero1 + " e " + numero2 + " è maggiore di 100, ovvero " + somma);
		}
		else {
			System.out.println("La somma tra " + numero1 + " e " + numero2 + " è minore di 100, ovvero " + somma);

		}
	}

}

package lezione4.esercizio9;

public class CheckNumero {
	
	public static void main(String[] args) {
		
		int numero = 28;
		
		if( numero == 26) {
			System.out.println("il numero " + numero + " è uguale a 26");
		}
		else if(numero < 26) {
			System.out.println("il numero " + numero + " è minore a 26");
		}
		
		else{
			System.out.println("il numero " + numero + " è maggiore a 26");

		}
	}
}


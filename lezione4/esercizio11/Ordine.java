package lezione4.esercizio11;

public class Ordine {
	
	public static void main(String[] args) {
		
		int numero1 = 20;
		int numero2 = 40;
		int numero3 = 10;
		
		//stampa se i numeri sono in ordine dal più basso al più alto
		
		if(numero1 < numero2 && numero2 < numero3) {
			System.out.println("i numeri " + numero1 + " " + numero2 + " " + numero3 + " sono in ordine dal più basso al più alto");
		}
		else {
			System.out.println("i numeri " + numero1 + " " + numero2 + " " + numero3 + " non sono in ordine dal più basso al più alto");

		}
	}

}

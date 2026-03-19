package lezione4.esercizio2;

public class Cicle {
	
	public static void main (String[] args) {
		
		System.out.println("Ciclo for per stampare da 1 a 14");
		
		for(int i = 1; i <= 14; i++   ) {
			if(i % 2 == 0) {
				System.out.println("il numero " + i + " è pari");
			}
		}
		
		System.out.println("Ciclo while per stampare da 1 a 14");
		
		int j = 1;
		while(j <= 14) {
			if(j % 2 == 0) {
				System.out.println("il numero " + j + " è pari");
			}
			j++;
		}
			
	}

}

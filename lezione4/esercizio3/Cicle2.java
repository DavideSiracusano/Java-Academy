package lezione4.esercizio3;

public class Cicle2 {
		
		public static void main (String[] args) {
			
			System.out.println("Ciclo for per stampare 14 a -3");
			
			for(int i = 14; i >= -3; i--) {
				if(i % 2 != 0) {
					System.out.println("il numero " + i + " è dispari");
				}
			}
			
			System.out.println("Ciclo while per stampare da 14 a -3");
			
			int j = 14;
			while(j >= -3) {
				if(j % 2 != 0) {
					System.out.println("il numero " + j + " è dispari");
				}
				j--;
			}
				
		}

	}


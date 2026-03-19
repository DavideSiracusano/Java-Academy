package lezione4.esercizio4;

public class Tabellina {
	
	
	public static void main(String[] args) {
		
		//ciclo for annidato per stampare tabelline
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("tabellina del : " + i);
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + " = " +(i * j));
			}
			System.out.println(); //spazio vuoto tra le tabelline
			
		}
	}

}

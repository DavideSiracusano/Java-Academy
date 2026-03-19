package lezione8.esercizio1;

// Creare una classe con tre metodi con lo stesso nome
// ma parametri diversi per effettuare overload

public class ClasseProva {
	
	// costruttore vuoto
	public ClasseProva() {
		
	}

	public void overload() {
		System.out.println("Metodo senza parametri");
	}

	public void overload(String testo) {
		System.out.println("Metodo con parametro String: " + testo);
	}

	public void overload(String testo, int numero) {
		System.out.println("Metodo con String e int: " + testo + " " + numero);
	}
}
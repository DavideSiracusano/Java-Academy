package lezione9.esercizi1a5;

public class ArrayUtils { // classe per esercizio 4

	public static void stampaPrimi5(int[] arr) throws CheckException {
		// controllo prima di tutto se l'array ha almeno 5 elementi
		if (arr.length < 5) {
			throw new CheckException("L'array ha meno di 5 elementi!");
		}

		// se passa il controllo, stampo i primi 5 elementi
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}
}
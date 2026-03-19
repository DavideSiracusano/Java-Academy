package lezione9.esercizi1a5;

public class Sottrazione { // classe per esercizio 5

	public static void sottrai(int numero, int[] sottraendi) throws CheckException {

		for (int s : sottraendi) {

			if (numero - s < 0) { // se il numero inserito è minore di quello dell'array
				throw new CheckException(("sottrazione minore di 0! " + numero + " - " + s + " = " + (numero - s)));
			}
			System.out.println(numero + " - " + s + " = " + (numero - s)); // mostra sottrazione

		}
	}
}

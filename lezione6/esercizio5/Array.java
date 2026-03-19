package lezione6.esercizio5;

//Creare una classe Java che abbia all’interno un array di interi contenente dei numeri scelti dal programmatore. 
//Stampare a schermo un messaggio se l’array contiene numeri negativi..

public class Array {

	public static void main(String[] args) {

		int[] numeri = { 1, 2, 50, 52, 29, -1, -2 };

		System.out.print("Numeri negativi presenti nell'array: ");
		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] < 0) {
				System.out.print(numeri[i] + " ");
			}
		}

	}

}

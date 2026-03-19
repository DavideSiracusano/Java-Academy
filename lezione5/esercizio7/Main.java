package lezione5.esercizio7;

import java.util.Scanner;

//Creare una classe Java che abbia all’interno un array di interi, con numeri arbitrari definiti dal programmatore. 
//Con l’ausilio di una variabile, controllare che un numero sia nell’array.

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] numeriPc = { 1, 3, 4, 6, 8, 10 }; // array di numeri casuali
		boolean trovato = false; // variabile boolean per trovare il numero

		System.out.println("inserisci numero");
		int numero = input.nextInt();

		// ciclo for per capire se il numero si trova nell'array
		for (int i = 0; i < numeriPc.length; i++) {

			if (numero == numeriPc[i]) {

				trovato = true; // soddisfa condizione e rimane in memoria
				break;
			}

		}

		if (trovato) {
			System.out.println("Il numero è presente");

		} else {
			System.out.println("Il numero non è presente");

		}
		input.close();

	}

}

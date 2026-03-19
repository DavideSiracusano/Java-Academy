package lezione6.esercizio3e4;

import java.util.Arrays;
import java.util.Scanner;

//Dato un array di numeri interi già definito come:int[] numeri = {1, 25, -4, 36, 0, -1, -4, 27, 3, -1, -1, 52};
//scrivere una classe che ha un metodo main che prende in input un numero intero dall’utente e 
//stampa se questo numero è presente o meno nell’array numeri.

public class Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numeri = { 1, 25, -4, 36, 0, -1, -4, 27, 3, -1, -1, 52 };

		System.out.println("inserisci un numero");
		int numero = input.nextInt();
		boolean trovato = false;

		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] == numero) {
				trovato = true;
				break;
			}

		}
		if (trovato) {
			System.out.println("numero trovato in " + Arrays.toString(numeri));
		} else {
			System.out.println("numero " + numero + " non trovato.");
		}
	}

}

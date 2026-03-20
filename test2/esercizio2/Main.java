package test2.esercizio2;

import java.util.*;

//Creare un’applicazione Java che chieda in input all’utente dei numeri positivi. 
//L’acquisizione dei numeri da parte dell’utente finisce quando l’utente digita un numero negativo. 
//Dopodiché, l’utente da in input un numero che chiameremo n. L’applicazione deve stampare a schermo due liste:
//•la lista dei numeri dati dall’utente, da cui vengono tolti i multipli di n.
//•La lista dei soli multipli di n.

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Quanti numeri vuoi inserire?");
		int numeri = input.nextInt();

		ArrayList<Integer> lista = new ArrayList<>();

		System.out.println("Inserisci i numeri:");
		for (int i = 0; i < numeri; i++) {
			int n = input.nextInt(); //numeri scelti dall'utente
			if (n < 0) {
				System.out.println("Il numero è negativo! 😡");
				break;
			}
			//si aggiungono i numeri alla lista
			lista.add(n);

		}
		//stampa risultato
		System.out.println("Lista originale: " + lista);

		System.out.println("Inserisci il valore di n:");
		int n = input.nextInt();

		List<Integer> multipli = new ArrayList<>();
		List<Integer> nonMultipli = new ArrayList<>();

		// ciclo for per trovare i multipli della lista ovvero quelli con resto zero
		for (Integer num : lista) {
			if (num % n == 0) {
				multipli.add(num);
			} else {
				nonMultipli.add(num);
			}
		}

		System.out.println("Non multipli di " + n + ": " + nonMultipli);
		System.out.println("Multipli di " + n + ": " + multipli);
	}
}

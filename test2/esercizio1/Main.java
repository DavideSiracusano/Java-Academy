package test2.esercizio1;

import java.util.*; //importo tutto il package per scanner e lista

//Creare una classe Java che chieda in input all’utente dei numeri che dovranno essere salvati in una lista. 
//L’algoritmo deve stampare la lista dei numeri inseriti, il massimo e la media di tutti gli elementi

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numeri = new ArrayList<>();

		System.out.println("Inserisci tre numeri:");

		int numero1 = input.nextInt();
		int numero2 = input.nextInt();
		int numero3 = input.nextInt();

		numeri.add(numero1);
		numeri.add(numero2);
		numeri.add(numero3);

		System.out.println("Hai inserito: " + numeri);

		// Calcolo media corretta
		double media = (numero1 + numero2 + numero3) / (double) numeri.size();
		System.out.println("La media di " + numeri + " è " + media);

		// Calcolo massimo
		int max = Collections.max(numeri);
		System.out.println("Il massimo è: " + max);
	}
}
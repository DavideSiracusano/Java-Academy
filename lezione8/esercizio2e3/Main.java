package lezione8.esercizio2e3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Calcolatrice calcolatore = new Calcolatrice();

		System.out.println("Inserisci il primo numero:");
		double a = input.nextDouble();

		System.out.println("Inserisci il secondo numero:");
		double b = input.nextDouble();

		System.out.println("Quanti numeri vuoi inserire nell'array?");
		int n = input.nextInt();
		double[] numeri = new double[n]; // dimensione dell'array scelto dall'utente dinamicamente

		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci numero " + (i + 1) + ":");
			numeri[i] = input.nextDouble();
		}

		System.out.println("----------------------");

		System.out.println("somma " + calcolatore.somma(a, b));
		System.out.println("somma overload " + calcolatore.somma(a, b, 2));
		System.out.println("somma array " + calcolatore.somma(a, numeri));

		System.out.println("----------------------");

		System.out.println("sottrazione " + calcolatore.sottrazione(a, b));
		System.out.println("sottrazione overload " + calcolatore.sottrazione(a, b, 2));
		System.out.println("sottrazione array " + calcolatore.sottrazione(a, numeri));

		System.out.println("----------------------");

		System.out.println("divisione " + calcolatore.divisione(a, b));
		System.out.println("divisione overload " + calcolatore.divisione(a, b, 2));
		System.out.println("divisione array " + calcolatore.divisione(a, numeri));

		System.out.println("----------------------");

		System.out.println("moltiplicazione " + calcolatore.moltiplicazione(a, b));
		System.out.println("moltiplicazione overload " + calcolatore.moltiplicazione(a, b, 2));
		System.out.println("moltiplicazione array " + calcolatore.moltiplicazione(a, numeri));

		input.close();
	}
}
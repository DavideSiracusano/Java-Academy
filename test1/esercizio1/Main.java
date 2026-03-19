package test1.esercizio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire?");
		int n = input.nextInt();

		int[] numeri = new int[n];
		int contatore = 0;
		int somma = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci numero " + (i + 1) + ":");
			int num = input.nextInt();

			// Se è il primo numero con indice, si accetta sempre
			if (i == 0) {
				numeri[i] = num;
				contatore++; // il contatore avanza
				somma += num; // somma è uguale a somma dei numeri
			} else {
				// Controlla se il numero è decrescente rispetto al precedente
				// numero inserito, indice -1 precendente)
				if (num < numeri[i - 1]) {
					numeri[i] = num;
					contatore++;
				} else {
					System.out.println("La sequenza non è più decrescente, stop.");
					break;
				}
			}
		}

		double media = (double) somma / contatore;
		System.out.println("Hai inserito " + contatore + " numeri.");
		System.out.println("La loro media è: " + media);

		input.close();
	}
}
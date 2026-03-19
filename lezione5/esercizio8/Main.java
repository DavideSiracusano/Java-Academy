package lezione5.esercizio8;

import java.util.Scanner;

//Creare una classe Java che abbia all’interno un array di interi contenente dei numeri scelti dal programmatore. 
//Stampare il massimo tra tutti gli elementi dell’array a schermo.

public class Main {

	public static void main(String[] args) {

		int[] array = new int[4]; // array con 4 valori

		Scanner input = new Scanner(System.in);
		System.out.println("inserisci 4 numeri");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt(); // ciclo for per inserire un numero tramite input ad ogni indice
		}

		int max = array[0]; // inizializzazione valore massimo

		for (int j = 0; j < array.length; j++) {
			if (array[j] > max) { // vede se ogni numero dell'array è maggiore di max

				max = array[j]; // nuovo valore di max in base al numero più grande tra gli array ciclati
			}
		}
		System.out.println("il numero massimo è " + max);
		input.close();

	}

}

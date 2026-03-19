package lezione9.esercizi1a5;

import java.util.Scanner;
import java.util.InputMismatchException; //per gestire eccezione input

//1- Creare una classe Java con un metodo main dove si provi a dividere un numero per 0, 
//gestendo l’eccezione risultante con un messaggio di errore appropriato.

//2- Creare una classe Java con un metodo main 
//nel quale ci sia un cast di un oggetto da int a String. Gestire l’eccezione risultante con un messaggio di errore appropriato.
//Nota: per poter compilare senza errori, è necessario fare una variabile int con un valore, poi una variabile di tipo Object 
//a cui si assegna il cast ad Object della variabile di interi e poi un System.out di un cast a String della variabile di tipo Object

//3- Creare una classe Java con un metodo main che chieda l’immissione di un numero double. 
//Gestire l’eccezione risultante dall’immissione di un carattere non numerico mostrando un messaggio di errore appropriato

//4- Creare una classe Java con un metodo main che preveda la stampa dei primi 5 elementi di un array di interi. 
//Qualora l’array avesse meno di 5 elementi, gestire l’eccezione mostrando un messaggio di errore appropriato.

//5- Scrivere un programma che, dato un numero ed un array di sottraendi, svolga l’operazione della sottrazione e, 
//nel caso in cui la sottrazione fosse impossibile 
//(ovvero quando il risultato è un numero negativo), sollevi un’eccezione personalizzata.

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Esercizio 1 ------------------------");


		// primo esercizio in un blocco try e catch per catturare eccezione
		try {
			int numero = 10 / 0;

		} catch (ArithmeticException e) { // eccezione aritmetica
			System.out.println("errore divisione per 0! " + e.getMessage());

		}

		System.out.println("Esercizio 2 ------------------------");

		// secondo esercizio in un altro blocco try catch
		try {
			int numero = 42;
			Object obj = numero; // variabile Object
			System.out.println((String) obj); // cast da int a string
		} catch (ClassCastException e) {
			System.out.println("errore nel casting! " + e.getMessage());
		}

		System.out.println("Esercizio 3 ------------------------");

		// terzo esercizio
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero double: ");
		try {
			double numero = input.nextDouble();
			System.out.println("Hai inserito " + numero);
		} catch (InputMismatchException e) { // cattura eccezione input (se non è double, esempio abc)
			System.out.println("errore inserimento numero! " + e.getMessage());

		}
		input.close();

		System.out.println("Esercizio 4 ------------------------");

		// quarto esercizio (vedere classe ArrayUtils)
		int[] array = { 1, 2, 3 };
		try {
			ArrayUtils.stampaPrimi5(array);
		} catch (CheckException e) { // custom eccezione
			System.out.println("Errore: " + e.getMessage());
		}

		System.out.println("Esercizio 5 ------------------------");

		// quinto esercizio (vedere classe Sottrazione)
		int[] array1 = { 20, 50, 70 };
		try {
			Sottrazione.sottrai(50, array1);
		} catch (CheckException e) {
			System.out.println("Errore: " + e.getMessage());

		}

	}

}

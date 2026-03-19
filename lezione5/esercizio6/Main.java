package lezione5.esercizio6;
import java.util.Scanner;

//Creare una classe Java che abbia all’interno un array di interi contenente dei numeri scelti dal programmatore. 
//Stampare la media di tutti gli elementi dell’array a schermo

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] numeri = new int[4]; //array di 4 numeri\
		int somma = 0; // assegnazione valore inziale somma
		int media = 0; // assegnazione valore iniziale media

		
		//ciclo for per inserire dentro ad ogni indice un numero input utente
		for(int i = 0; i < numeri.length; i++ ) {
			
			System.out.println("inserisci numero" + (i + 1));
			numeri[i] = input.nextInt();
			
			//prima si prende la somma data dal numero di array in input e poi si stampa la media (somma diviso il numero dei numeri)
			somma += numeri [i];
			media = somma / numeri.length;
			
		}
		System.out.println("la media è " + media);
		
		input.close();
		
	}
	
}

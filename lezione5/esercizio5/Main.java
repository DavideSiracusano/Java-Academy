package lezione5.esercizio5;
import java.util.Scanner;

//Creare una classe Java che abbia all’interno un array di interi contenente dei numeri scelti dal programmatore. 
//Stampare la somma di tutti gli elementi dell’array a schermo.

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] numeri = new int[4]; //array di 4 numeri
		int somma = 0; // assegnazione valore iniziale somma

		
		//ciclo for per inserire dentro ad ogni indice un numero input utente
		for(int i = 0; i < numeri.length; i++ ) {
			
			System.out.println("inserisci numero" + (i + 1));
			numeri[i] = input.nextInt();
			
			somma += numeri[i];
			
		}
		System.out.println("la somma è " + somma);
		
		input.close();
		
	}
	
}

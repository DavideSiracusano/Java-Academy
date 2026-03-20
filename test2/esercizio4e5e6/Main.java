package test2.esercizio4e5e6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("inserisci il numero di click");

		int maxClick = input.nextInt();
		Lampadina lampadina = new Lampadina(maxClick);

		int scelta;
		// do while mentre la condizione è diversa da 0
		do {
			System.out.println("Menu:");
			System.out.println("1 - Click lampadina");
			System.out.println("2 - Stato lampadina");
			System.out.println("3 - staccare corrente");
			System.out.println("4 - accendere corrente");
			System.out.println("0 - Termina");
			System.out.print("Scelta: ");
			scelta = input.nextInt();

			
			switch (scelta) {
			// scelta 1 invoca il metodo click di lampadina e cambia lo stato
			case 1:
				lampadina.click();
				System.out.println("Click eseguito!");
				break;
			// scelta 2 stampa lo stato della lampadina
			case 2:
				System.out.println("Stato lampadina: " + lampadina.stato());
				break;
			// scelta 3 la corrente è staccata
			case 3:
				Lampadina.setCorrente(false);
			    System.out.println("staccata.");
				break;
			// scelta 4 la corrente è accesa
			case 4:
				Lampadina.setCorrente(true);
			    System.out.println("attaccata.");
				break;
			// esce dal programma
			case 0:
				System.out.println("Uscita dal programma.");
				break;
			default:
				System.out.println("Scelta non valida!");
			}
		} while (scelta != 0);

		System.out.println("--------------Test interruttori---------------");
		
		Interruttore interruttore1 = new Interruttore(lampadina);
		Interruttore interruttore2 = new Interruttore(lampadina);
		
		// stesso criterio
		int sceltaInterruttore;
		do {
			System.out.println("Menu:");
			System.out.println("1 - interruttore1");
			System.out.println("2 - interruttore2");
			System.out.println("0 - Termina");
			System.out.print("Scelta: ");
			sceltaInterruttore = input.nextInt();

			switch (sceltaInterruttore) {
			case 1:
				interruttore1.premi();
				System.out.println("Click interruttore1 eseguito! " + lampadina.stato());
				break;
			case 2:
				interruttore2.premi();
				System.out.println("Click interruttore2 eseguito! " + lampadina.stato());
				break;
			case 0:
				System.out.println("Uscita dal programma.");
				break;
			default:
				System.out.println("Scelta non valida!");
			}
		} while (sceltaInterruttore != 0);
		
		
		input.close();

		

		
	}
}

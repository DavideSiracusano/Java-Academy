package lezione12.esercizio1;

//Classe principale con il metodo main: punto di ingresso del programma.
//Dimostra l'utilizzo del sistema di gestione della flotta.
public class Main {

	public static void main(String[] args) {

		// Creazione del gestore della flotta
		GestioneFlotta flotta = new GestioneFlotta();

		// --- AGGIUNTA VEICOLI ---
		// Creiamo istanze concrete delle tre sottoclassi e le aggiungiamo alla flotta

		// Automobile: modello, targa, anno, €/giorno, numero posti
		flotta.aggiungiVeicolo(new Automobile("Fiat 500", "AB123CD", 2020, 45.00, 5));
		flotta.aggiungiVeicolo(new Automobile("Toyota Yaris", "EF456GH", 2022, 50.00, 5));
		flotta.aggiungiVeicolo(new Automobile("BMW Serie 3", "IJ789KL", 2023, 95.00, 5));

		// Furgone: modello, targa, anno, €/giorno, capacità carico in kg
		flotta.aggiungiVeicolo(new Furgone("Ford Transit", "MN012OP", 2019, 80.00, 1200.0));
		flotta.aggiungiVeicolo(new Furgone("Iveco Daily", "QR345ST", 2021, 110.00, 2500.0));

		// Motociclo: modello, targa, anno, €/giorno, cilindrata in cc
		flotta.aggiungiVeicolo(new Motociclo("Honda CB500", "UV678WX", 2021, 35.00, 500));
		flotta.aggiungiVeicolo(new Motociclo("Yamaha MT-07", "YZ901AB", 2022, 55.00, 689));

		// --- VISUALIZZAZIONE COMPLETA ---
		flotta.visualizzaFlotta();

		// --- CALCOLO COSTI ---
		System.out.println("=== CALCOLO COSTI NOLEGGIO ===");
		flotta.calcolaCostoNoleggio("Fiat 500", 3); // 3 giorni
		flotta.calcolaCostoNoleggio("Ford Transit", 7); // 7 giorni
		flotta.calcolaCostoNoleggio("Honda CB500", 2); // 2 giorni
		flotta.calcolaCostoNoleggio("Ferrari 488", 1); // modello inesistente → messaggio errore
		System.out.println();

		// --- NOLEGGIO DI UN VEICOLO ---
		System.out.println("=== NOLEGGIO ===");
		flotta.noleggiaVeicolo("AB123CD"); // Fiat 500 → disponibile → OK
		flotta.noleggiaVeicolo("AB123CD"); // secondo tentativo → già noleggiato

		// --- VISUALIZZAZIONE SOLO DISPONIBILI ---
		flotta.visualizzaDisponibili();

		// --- RESTITUZIONE ---
		System.out.println("=== RESTITUZIONE ===");
		flotta.restituisciVeicolo("AB123CD"); // Fiat 500 restituita
		System.out.println();

		// --- RIMOZIONE (veicolo venduto) ---
		System.out.println("=== RIMOZIONE VEICOLO VENDUTO ===");
		flotta.rimuoviPerTarga("MN012OP"); // Ford Transit venduto → rimosso
		flotta.rimuoviPerTarga("ZZ999ZZ"); // targa inesistente → messaggio errore

		// --- VISUALIZZAZIONE FINALE ---
		flotta.visualizzaFlotta();
	}
}
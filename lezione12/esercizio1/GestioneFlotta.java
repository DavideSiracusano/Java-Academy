package lezione12.esercizio1;

import java.util.ArrayList;
import java.util.List;

// Classe che gestisce l'intera flotta di veicoli.
// Centralizza tutte le operazioni: aggiunta, rimozione, visualizzazione,
// noleggio e calcolo dei costi.
public class GestioneFlotta {

	// Lista generica di Veicolo: grazie al polimorfismo può contenere
	// Automobile, Furgone e Motociclo nello stesso contenitore
	private List<Veicolo> flotta;

	// Costruttore: inizializza la lista vuota
	public GestioneFlotta() {
		this.flotta = new ArrayList<>();
	}

	// --- AGGIUNTA ---

	// Aggiunge un veicolo alla flotta (accetta qualsiasi sottoclasse di Veicolo)
	public void aggiungiVeicolo(Veicolo v) {
		flotta.add(v);
		System.out.println("Aggiunto: " + v.getModello() + " (" + v.getTarga() + ")");
	}

	// --- RIMOZIONE ---

	// Rimuove un veicolo dalla flotta cercandolo per targa (univoca).
	// Utile quando il veicolo viene venduto.
	public boolean rimuoviPerTarga(String targa) {
		// Iteriamo la lista e cerchiamo la targa (case-insensitive per comodità)
		for (Veicolo v : flotta) {
			if (v.getTarga().equalsIgnoreCase(targa)) {
				flotta.remove(v); // rimozione sicura uscendo subito dal loop
				System.out.println("Veicolo con targa " + targa + " rimosso dalla flotta.");
				return true;
			}
		}
		// Nessun veicolo trovato con quella targa
		System.out.println("Nessun veicolo trovato con targa: " + targa);
		return false;
	}

	// --- VISUALIZZAZIONE ---

	// Mostra tutti i veicoli presenti nella flotta con i loro dettagli completi
	public void visualizzaFlotta() {
		if (flotta.isEmpty()) {
			System.out.println("La flotta è vuota.");
			return;
		}
		System.out.println("\n===== FLOTTA COMPLETA (" + flotta.size() + " veicoli) =====");
		for (int i = 0; i < flotta.size(); i++) {
			// toString() di ogni veicolo viene chiamato implicitamente (polimorfismo)
			System.out.println((i + 1) + ". " + flotta.get(i));
		}
		System.out.println("=================================================\n");
	}

	// Mostra solo i veicoli attualmente disponibili al noleggio
	public void visualizzaDisponibili() {
		System.out.println("\n===== VEICOLI DISPONIBILI =====");
		boolean trovato = false;
		for (Veicolo v : flotta) {
			if (v.isDisponibile()) {
				System.out.println(v);
				trovato = true;
			}
		}
		if (!trovato)
			System.out.println("Nessun veicolo disponibile al momento.");
		System.out.println("================================\n");
	}

	// --- CALCOLO COSTO ---

	// Calcola il costo totale del noleggio per un dato modello e numero di giorni.
	// Se esistono più veicoli con lo stesso modello, prende il primo disponibile.
	public void calcolaCostoNoleggio(String modello, int giorni) {
		for (Veicolo v : flotta) {
			// Confronto case-insensitive: l'utente potrebbe scrivere "fiat 500" o "Fiat
			// 500"
			if (v.getModello().equalsIgnoreCase(modello)) {
				double costo = v.calcolaCosto(giorni); // chiamata al metodo della superclasse
				System.out.printf("Costo noleggio '%s' per %d giorni: €%.2f%n", v.getModello(), giorni, costo);
				return;
			}
		}
		System.out.println("Modello '" + modello + "' non trovato in flotta.");
	}

	// --- NOLEGGIO E RESTITUZIONE ---

	// Segna un veicolo come noleggiato cercandolo per targa
	public void noleggiaVeicolo(String targa) {
		Veicolo v = cercaPerTarga(targa);
		if (v != null) {
			v.noleggia(); // metodo definito in Veicolo, gestisce già il caso "già noleggiato"
		} else {
			System.out.println("Veicolo con targa " + targa + " non trovato.");
		}
	}

	// Segna un veicolo come restituito cercandolo per targa
	public void restituisciVeicolo(String targa) {
		Veicolo v = cercaPerTarga(targa);
		if (v != null) {
			v.restituisci();
		} else {
			System.out.println("Veicolo con targa " + targa + " non trovato.");
		}
	}

	// --- METODO HELPER PRIVATO ---

	// Ricerca interna per targa: restituisce il Veicolo trovato o null
	private Veicolo cercaPerTarga(String targa) {
		for (Veicolo v : flotta) {
			if (v.getTarga().equalsIgnoreCase(targa)) {
				return v;
			}
		}
		return null; // non trovato
	}
}
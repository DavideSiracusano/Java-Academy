package lezione12.esercizio1;

//Classe astratta base che rappresenta un generico veicolo della flotta.
//Essendo astratta, non può essere istanziata direttamente: serve da "blueprint"
//per le classi concrete (Automobile, Furgone, Motociclo).
public abstract class Veicolo {

	// Attributi comuni a tutti i veicoli (incapsulati con 'private')
	private String modello; // es. "Fiat 500"
	private String targa; // es. "AB123CD"
	private int annoImmatricolazione; // es. 2021
	private double costoGiornaliero; // costo in euro per un giorno di noleggio
	private boolean disponibile; // true = disponibile al noleggio, false = già noleggiato

	// Costruttore che inizializza tutti i campi comuni.
	// Viene richiamato con 'super(...)' dalle sottoclassi.
	public Veicolo(String modello, String targa, int annoImmatricolazione, double costoGiornaliero) {
		this.modello = modello;
		this.annoImmatricolazione = annoImmatricolazione;
		this.costoGiornaliero = costoGiornaliero;
		this.targa = targa;
		this.disponibile = true; // ogni veicolo nasce disponibile
	}

	// --- Getter e Setter ---

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}

	public void setAnnoImmatricolazione(int anno) {
		this.annoImmatricolazione = anno;
	}

	public double getCostoGiornaliero() {
		return costoGiornaliero;
	}

	public void setCostoGiornaliero(double costo) {
		this.costoGiornaliero = costo;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	// Marca il veicolo come noleggiato (non disponibile)
	public void noleggia() {
		if (!disponibile) {
			System.out.println("Veicolo " + modello + " già noleggiato.");
			return;
		}
		this.disponibile = false;
		System.out.println("Veicolo " + modello + " noleggiato con successo.");
	}

	// Marca il veicolo come nuovamente disponibile (restituzione)
	public void restituisci() {
		this.disponibile = true;
		System.out.println("Veicolo " + modello + " restituito e ora disponibile.");
	}

	// Calcola il costo totale per un certo numero di giorni
	public double calcolaCosto(int giorni) {
		return costoGiornaliero * giorni;
	}

	// Metodo astratto: ogni sottoclasse deve fornire la propria implementazione
	// per mostrare le informazioni specifiche del tipo di veicolo.
	public abstract String getDettagliSpecifici();

	// Metodo toString sovrascritto: mostra le info comuni + quelle specifiche della
	// sottoclasse
	@Override
	public String toString() {
		return String.format("Modello: %-15s | Targa: %-8s | Anno: %d | €/giorno: %.2f | %s | %s", modello, targa,
				annoImmatricolazione, costoGiornaliero, disponibile ? "DISPONIBILE" : "NON DISPONIBILE",
				getDettagliSpecifici() // chiamata polimorfica al metodo della sottoclasse
		);
	}
}
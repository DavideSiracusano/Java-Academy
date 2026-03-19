package test1.esercizio3e4;

//Creare una classe Java che rappresenti una macchinetta per il caffè a cialde. 
//Dotare la classe degli attributi e costruttori che ritenete appropriati, applicando i principi dell’incapsulamento. 
//Dotare la classe dei metodi necessari per fare queste azioni:
//a.Simulare un caffè, usando una cialda.
//b.Svuotare il cassetto delle cialde usate quando è pieno.
//c.Mostrare quanti caffè sono stati fatti in totale.
//d.Mostrare quanti caffè sono stati fatti dall’ultima volta che si è svuotato il cassetto delle cialde usate.

public class MacchinettaCaffe {

	private String marca;
	private String modello;
	private int cialde; // cialde disponibili
	private int totaleCaffe = 0; // totale caffè fatti
	private int caffeUltimoSvuotamento = 0; // caffè fatti dall’ultimo svuotamento

	// Costruttore vuoto
	public MacchinettaCaffe() {
	}

	// Costruttore parametrizzato
	public MacchinettaCaffe(String marca, String modello, int cialde) {
		this.marca = marca;
		this.modello = modello;
		this.cialde = cialde;
	}

	// --------------------------
	// Getter e setter
	// --------------------------
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCialde() {
		return cialde;
	}

	public void setCialde(int cialde) {
		this.cialde = cialde;
	}

	// --------------------------
	// Metodi principali
	// --------------------------

	// a. Simulare un caffè
	public void simulaCaffe() {
		if (cialde > 0) {
			cialde--; // usa una cialda
			totaleCaffe++; // aggiorna totale caffè
			caffeUltimoSvuotamento++; // aggiorna contatore dall’ultimo svuotamento
			System.out.println("Caffè fatto! ☕");
		} else {
			System.out.println("Nessuna cialda disponibile!");
		}
	}

	// b. Svuotare il cassetto delle cialde usate
	public void svuotaCassetto() {
		System.out.println("Cassetto svuotato.");
		caffeUltimoSvuotamento = 0; // reset del contatore dall’ultimo svuotamento
	}

	// c. Mostrare totale caffè fatti
	public void caffeTotale() {
		System.out.println("caffe fatti " + totaleCaffe);
	}

	// d. Mostrare caffè fatti dall’ultimo svuotamento
	public void caffeDallUltimoSvuotamento() {
		System.out.println("caffe dall'ultimo svuotamento " + caffeUltimoSvuotamento);
	}
}
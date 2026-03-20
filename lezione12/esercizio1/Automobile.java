package lezione12.esercizio1;

//Sottoclasse concreta che rappresenta un'automobile.
//Estende Veicolo aggiungendo l'attributo specifico: numero di posti.
public class Automobile extends Veicolo {

	private int numeroPosti; // numero di posti a sedere dell'automobile

	// Costruttore: richiama il costruttore della superclasse con 'super'
	// e inizializza l'attributo specifico
	public Automobile(String modello, String targa, int annoImmatricolazione, double costoGiornaliero,
			int numeroPosti) {
		super(modello, targa, annoImmatricolazione, costoGiornaliero);
		this.numeroPosti = numeroPosti;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	// Implementazione obbligatoria del metodo astratto della superclasse:
	// restituisce i dettagli specifici dell'automobile
	@Override
	public String getDettagliSpecifici() {
		return "Tipo: Automobile | Posti: " + numeroPosti;
	}
}

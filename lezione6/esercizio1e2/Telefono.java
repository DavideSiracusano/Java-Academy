package lezione6.esercizio1e2;

public class Telefono {

	private String numero;
	private int credito;
	private String ultimoNumero; // ultimo telefono chiamato

	// costruttore vuoto
	public Telefono() {
	}

	// costruttore parametrizzato
	public Telefono(String numero, int credito) {
		this.numero = numero;
		this.credito = credito;
	}

	// getter e setter
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	// chiama un altro telefono
	public void chiama(String altroTelefono) {
		if (credito > 0) {
			System.out.println(this.numero + " sta chiamando il numero " + altroTelefono);
			ultimoNumero = altroTelefono;
			credito -= 2; // costo chiamata
		} else {
			System.out.println("Credito insufficiente per chiamare.");
		}
	}

	// stampa credito residuo
	public void creditoResiduo() {
		System.out.println("Credito residuo: " + credito);
	}

	// stampa ultima chiamata effettuata
	public void chiamataEffettuata() {
		if (ultimoNumero != null) {
			System.out.println("Hai chiamato il numero " + ultimoNumero);
		} else {
			System.out.println("Nessuna chiamata effettuata.");
		}
	}

	// richiama l’ultimo telefono
	public void richiama() {

		System.out.println("sta richiamando il numero " + ultimoNumero);
	}

	// ricarica credito
	public void ricarica(int importo) {
		credito += importo;
		System.out.println("Ricarica di " + importo + ". Totale: " + credito);
	}
}
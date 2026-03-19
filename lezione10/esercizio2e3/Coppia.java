package lezione10.esercizio2e3;

//solo tipi numerici
public class Coppia<N extends Number> {

	// attributi privati
	private N uno;
	private N due;

	// costruttore vuoto
	public Coppia() {
	}

	// metodo per salvare i due elementi
	public void set(N primo, N secondo) {
		this.uno = primo;
		this.due = secondo;
	}

	// metodo per ottenere il primo elemento
	public N getUno() {
		return uno;
	}

	// metodo per ottenere il secondo elemento
	public N getDue() {
		return due;
	}

}

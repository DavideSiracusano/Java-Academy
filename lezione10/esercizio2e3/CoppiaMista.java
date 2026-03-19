package lezione10.esercizio2e3;

public class CoppiaMista<T, U> {

	// attributi privati
	private T uno;
	private U due;

	// costruttore vuoto
	public CoppiaMista() {
	}

	// set per salvare i due elementi
	public void set(T primo, U secondo) {
		this.uno = primo;
		this.due = secondo;
	}

	// metodo per ottenere il primo elemento
	public T getUno() {
		return uno;
	}

	// metodo per ottenere il secondo elemento
	public U getDue() {
		return due;
	}

}

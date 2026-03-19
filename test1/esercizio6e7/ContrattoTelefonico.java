package test1.esercizio6e7;

public abstract class ContrattoTelefonico {
	protected int numero;
	protected String abbonamento;
	protected double bolletta = 0; // accumula il costo delle chiamate

	public static final double COSTO_AL_SECONDO = 0.05;

	public ContrattoTelefonico() {
	}

	public ContrattoTelefonico(int numero, String abbonamento) {
		this.numero = numero;
		this.abbonamento = abbonamento;
	}

	// Metodo astratto: ogni sottoclasse calcola il costo della chiamata
	public abstract double costoChiamata(int durataSecondi);

	// get bolletta
	public double getBolletta() {
		return bolletta;
	}
}
package test1.esercizio6e7;

public class ContrattoFisso extends ContrattoTelefonico {

	private String indirizzoUtenza;

	public ContrattoFisso(int numero, String abbonamento, String indirizzoUtenza) {
		super(numero, abbonamento);
		this.indirizzoUtenza = indirizzoUtenza;
	}

	@Override
	public double costoChiamata(int durataSecondi) {
		double costo = COSTO_AL_SECONDO * durataSecondi;
		bolletta += costo;
		return costo;
	}
}
package test1.esercizio6e7;

public class ContrattoMobile extends ContrattoTelefonico {

	private String operatore;

	public ContrattoMobile(int numero, String abbonamento, String operatore) {
		super(numero, abbonamento);
		this.operatore = operatore;
	}

	@Override
	public double costoChiamata(int durataSecondi) {
		double costo = COSTO_AL_SECONDO * durataSecondi;
		double extra = 0.02 * durataSecondi; // piccolo extra per mobile
		costo += extra;
		bolletta += costo;
		return costo;
	}
}

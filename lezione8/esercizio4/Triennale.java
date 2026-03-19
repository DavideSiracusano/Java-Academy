package lezione8.esercizio4;

public class Triennale extends Studente {

	public Triennale() {
	}

	public Triennale(String nome, String cognome, double isee, int annoCorso) {
		super(nome, cognome, isee, annoCorso);
	}

	@Override
	public double calcolaTassa() {
		double tassaBase = super.calcolaTassa();

		int anniFuoriCorso = 0;
		if (getAnnoCorso() <= 3) {
			anniFuoriCorso = 0;
		} else {
			anniFuoriCorso = getAnnoCorso() - 3;

		}

		return tassaBase * (1 + 0.10 * anniFuoriCorso); // incremento 10% per anno
	}
}
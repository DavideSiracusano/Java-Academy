package lezione12.esercizio1;

//Sottoclasse concreta che rappresenta un motociclo.
//Aggiunge la cilindrata in cc rispetto alla classe base.
public class Motociclo extends Veicolo {

	private int cilindrata; // cilindrata in cc (es. 125, 650, 1000)

	public Motociclo(String modello, String targa, int annoImmatricolazione, double costoGiornaliero, int cilindrata) {
		super(modello, targa, annoImmatricolazione, costoGiornaliero);
		this.cilindrata = cilindrata;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	// Dettagli specifici del motociclo
	@Override
	public String getDettagliSpecifici() {
		return "Tipo: Motociclo | Cilindrata: " + cilindrata + " cc";
	}
}
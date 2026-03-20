package lezione12.esercizio1;

//Sottoclasse concreta che rappresenta un furgone.
//Aggiunge la capacità di carico in chilogrammi rispetto alla classe base.
public class Furgone extends Veicolo {

	private double capacitaCarico; // capacità di carico in kg

	public Furgone(String modello, String targa, int annoImmatricolazione, double costoGiornaliero,
			double capacitaCarico) {
		super(modello, targa, annoImmatricolazione, costoGiornaliero);
		this.capacitaCarico = capacitaCarico;
	}

	public double getCapacitaCarico() {
		return capacitaCarico;
	}

	public void setCapacitaCarico(double capacitaCarico) {
		this.capacitaCarico = capacitaCarico;
	}

	// Dettagli specifici del furgone
	@Override
	public String getDettagliSpecifici() {
		return "Tipo: Furgone | Carico: " + capacitaCarico + " kg";
	}
}
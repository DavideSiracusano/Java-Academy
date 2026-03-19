package lezione7.esercizio3e4;

public abstract class Soldato {

	private String nome;
	private int eta;
	private String plotone;

	// Costruttore vuoto
	public Soldato() {
	}

	// Costruttore con parametri
	public Soldato(String nome, int eta, String plotone) {
		this.nome = nome;
		this.eta = eta;
		this.plotone = plotone;
	}

	// Getter
	public String getNome() {
		return nome;
	}

	public int getEta() {
		return eta;
	}

	public String getPlotone() {
		return plotone;
	}

	// Setter
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public void setPlotone(String plotone) {
		this.plotone = plotone;
	}

	// Metodi concreti
	public void combatti() {
		System.out.println(nome + " combatte");
	}

	public void riposa() {
		System.out.println(nome + " riposa");
	}

	public void avanza() {
		System.out.println(nome + " avanza");
	}

	// Metodo astratto
	public abstract void gridoDiBattaglia();

	// Override toString di object
	@Override
	public String toString() {
		return "Soldato nome = " + nome + ", eta = " + eta + ", plotone = " + plotone;
	}
}
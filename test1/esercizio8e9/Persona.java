package test1.esercizio8e9;

public class Persona {

	private String nome;
	private String cognome;
	private int eta;

	// Costruttore
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	// Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	// Override di toString()
	@Override
	public String toString() {
		return nome + " " + cognome + ", Età: " + eta;
	}
}
package test2.esercizio3;

public class Giocatore {

	private String nome;
	private int prezzoGiocatore;

	public Giocatore(String nome, int prezzoGiocatore) {
		this.nome = nome;
		this.prezzoGiocatore = prezzoGiocatore;

	}

	// metodi get
	public String getNome() {
		return nome;
	}

	public int getPrezzo() {
		return prezzoGiocatore;
	}

	@Override // di toString
	public String toString() {
		return nome + " (€" + prezzoGiocatore + ")";
	}

}

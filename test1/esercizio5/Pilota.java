package test1.esercizio5;

public class Pilota {

	private String nome;
	private Auto auto;

	public Pilota() {
	}

	public Pilota(String nome, Auto auto) {
		this.nome = nome;
		this.auto = auto;

	}

	// get e set per nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	// get e set per auto
	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Auto getAuto() {
		return auto;
	}

}

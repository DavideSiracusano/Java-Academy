package lezione7.esercizio3e4;

public class Cavaliere extends Soldato {

	public Cavaliere(String nome, int eta, String plotone) {
		super(nome, eta, plotone); // chiama il costruttore Soldato

	}

	@Override
	public void gridoDiBattaglia() {
		System.out.println("grido di battaglia del Cavaliere " + getNome());
	}

}

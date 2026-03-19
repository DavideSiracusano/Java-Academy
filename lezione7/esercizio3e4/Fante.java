package lezione7.esercizio3e4;

public class Fante extends Soldato {

	public Fante(String nome, int eta, String plotone) {
		super(nome, eta, plotone); // chiama il costruttore Soldato

	}

	@Override
	public void gridoDiBattaglia() {
		System.out.println("grido di battaglia del Fante " + getNome());
	}

}

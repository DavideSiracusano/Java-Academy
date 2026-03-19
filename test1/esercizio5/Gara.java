package test1.esercizio5;

import java.util.Random;

public class Gara {

	private String circuito;
	private Pilota[] griglia; // griglia di piloti della classe Pilota
	private Pilota vincitore; // vincitore della classe Pilota

	public Gara() {
	}

	public Gara(String circuito, Pilota[] griglia) {
		this.circuito = circuito;
		this.griglia = griglia;
	}

	// get e set di ciruito
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public String getCircuito() {
		return circuito;
	}

	// get e set di griglia
	public void setGriglia(Pilota[] griglia) {
		this.griglia = griglia;
	}

	public Pilota[] setGriglia() {
		return griglia;
	}

	// get e set di vincitore
	public void setVincitore(Pilota vincitore) {
		this.vincitore = vincitore;
	}

	public Pilota getVincitore() {
		return vincitore;
	}

	// metodo griglia di partenza
	public void grigliaPartenza() {
		griglia = new Pilota[4];

		Auto a1 = new Auto("kart1");
		Auto a2 = new Auto("kart2");
		Auto a3 = new Auto("kart3");
		Auto a4 = new Auto("kart4");

		Pilota p1 = new Pilota("Crash", a1);
		Pilota p2 = new Pilota("Coco", a2);
		Pilota p3 = new Pilota("Tiger", a3);
		Pilota p4 = new Pilota("Dingodile", a4);

		griglia[0] = p1;
		griglia[1] = p2;
		griglia[2] = p3;
		griglia[3] = p4;

		System.out.println("i piloti " + p1.getNome() + ", " + p2.getNome()+ ", "  + p3.getNome() + ", " + p4.getNome()
				+ " sono carichi!...");
	}

	// metodo gara per scorrere randomicamente nell'indice della griglia piloti e
	// prendere un vincitore
	public void corriGara() {
		Random random = new Random();
		int indice = random.nextInt(griglia.length); // posizione casuale
		vincitore = griglia[indice]; // prende il pilota

		System.out.println(
				"ha vinto il pilota " + vincitore.getNome() + " con auto " + vincitore.getAuto().getScuderia());
	}

}

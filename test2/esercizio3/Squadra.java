package test2.esercizio3;

import java.util.ArrayList;

public class Squadra {

	private String nome;
	private int capitale;
	private ArrayList<Giocatore> giocatori;

	public Squadra(String nome, int capitale) {

		this.nome = nome;
		this.capitale = capitale;
		this.giocatori = new ArrayList<>();

	}

	// metodo per acquistare giocatori se il capitale è maggiore o uguale del prezzo
	// del giocatore
	public void acuistaGiocatori(Giocatore g) {
		if (capitale >= g.getPrezzo()) {
			giocatori.add(g);
			capitale -= g.getPrezzo();
			System.out.println("Hai acquistato: " + g.getNome());
		} else {
			System.out.println("Capitale insufficiente per acquistare " + g.getNome());
		}
	}

	void vendiGiocatori(Giocatore g) {
		giocatori.remove(g);
		capitale += g.getPrezzo();
		System.out.println("Hai venduto: " + g.getNome() + " capitale " + capitale);

	}

	public void stampaSquadra() {
		System.out.println("Squadra: " + nome);
		System.out.println("Capitale: €" + capitale);
		System.out.println("Giocatori: " + giocatori);
	}
}

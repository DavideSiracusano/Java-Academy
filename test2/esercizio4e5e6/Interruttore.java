package test2.esercizio4e5e6;

public class Interruttore {
	private Lampadina lampadina; // tiene un riferimento

	public Interruttore(Lampadina lampadina) {
		this.lampadina = lampadina;
	}

	public void premi() {
		lampadina.click(); // delega alla lampadina
	}
}
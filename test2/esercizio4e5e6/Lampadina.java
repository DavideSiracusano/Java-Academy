package test2.esercizio4e5e6;

public class Lampadina {
	private String stato;
	private int clickMax;
	private int clickEffettuati;
	private static boolean correntePresente = true; //static per la corrente


	public Lampadina(int clickMax) {
		this.stato = "spenta";
		this.clickMax = clickMax;
		this.clickEffettuati = 0;
	}

	String stato() {
		if(!correntePresente && !stato.equals("rotta") ) {
			return  "spenta";
			
		} 
		return stato;
	}

	void click() {
		if (stato.equals("rotta")) {
			System.out.println("lo stato della lampada è rotta");
			return;

		} else if (stato.equals("accesa")) {
			stato = "spenta";

		} else {
			stato = "accesa";
		}
		clickEffettuati++;
		if (clickEffettuati >= clickMax) {
			stato = "rotta";
		}
	}
	
	//metodo statico per cambiare la corrente
	public static void setCorrente(boolean corrente) {
	    correntePresente = corrente;
	}

}

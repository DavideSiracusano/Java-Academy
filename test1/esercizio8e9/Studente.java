package test1.esercizio8e9;

public class Studente extends Persona {

	private double mediaVoti;

	public Studente(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
	}

	// Getter e setter per mediaVoti
	public double getMediaVoti() {
		return mediaVoti;
	}

	public void setMediaVoti(double mediaVoti) {
		this.mediaVoti = mediaVoti;
	}

	// Override di toString()
	@Override
	public String toString() {
		return super.toString() + ", Media voti: " + mediaVoti;
	}

	// Metodo studia
	public void studia() {
		System.out.println(getNome() + " sta studiando...");
	}

	// Metodo per calcolare media voti con varargs
	public void calcolaMediaVoti(int... voti) {
		if (voti.length == 0) {
			mediaVoti = 0;
			return;
		}

		int somma = 0;
		for (int voto : voti) {
			somma += voto;
		}
		mediaVoti = (double) somma / voti.length;
		System.out.println("media voti " + mediaVoti);
	}
}
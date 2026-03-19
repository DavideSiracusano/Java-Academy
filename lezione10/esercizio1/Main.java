package lezione10.esercizio1;

public class Main {

	public static void main(String[] args) {

		// si chiamano le direzioni
		Cardinal direzioneNord = Cardinal.NORD;
		Cardinal direzioneSud = Cardinal.SUD;

		System.out.println("la direzione " + direzioneNord + " è opposta a " + direzioneSud + " ? "
				+ direzioneNord.isOppositeOf(direzioneSud));

		System.out.println("la direzione tra " + direzioneNord + " " + direzioneSud + " è "
				+ Cardinal.mix(direzioneNord, direzioneSud));

	}

}

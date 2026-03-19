package test1.esercizio3e4;

public class Main {

	public static void main(String[] args) {

		MacchinettaCaffe macchinetta = new MacchinettaCaffe("Borbone", "2-452", 1);

		System.out.println("Selezionato " + macchinetta.getMarca());
		macchinetta.simulaCaffe();
		macchinetta.caffeDallUltimoSvuotamento();
		macchinetta.caffeTotale();
		macchinetta.svuotaCassetto();

		// check per vedere caffe dall'ultimo svuotamento dopo avere svuotato
		macchinetta.caffeDallUltimoSvuotamento();


	}
}

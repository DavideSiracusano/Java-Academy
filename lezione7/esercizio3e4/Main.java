package lezione7.esercizio3e4;

public class Main {

	public static void main(String[] args) {

		Soldato fante = new Fante("Luigi", 22, "undici");
		Soldato cavaliere = new Cavaliere("Gigi", 22, "medieval platone");

		fante.avanza();
		fante.combatti();
		fante.riposa();
		fante.gridoDiBattaglia();
		System.out.println(fante);
		System.out.println("--------");

		cavaliere.avanza();
		cavaliere.combatti();
		cavaliere.riposa();
		cavaliere.gridoDiBattaglia();
		System.out.println(cavaliere);

	}

}

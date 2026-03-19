package lezione8.esercizio4;

public class Main {

	public static void main(String[] args) {

		Studente[] studenti = { new Triennale("Luigi", "Rossi", 9000, 1), new Triennale("Anna", "Bianchi", 12000, 4),
				new Magistrale("Paola", "Neri", 35000, 3), new Magistrale("Luca", "Neri", 30000, 5),
				new Magistrale("Giada", "Gialli", 10000, 3), new Triennale("Paolo", "Verdi", 15000, 2), };

		for (Studente s : studenti) {
			System.out.println(s.getNome() + " paga: " + s.calcolaTassa());
		}
	}
}

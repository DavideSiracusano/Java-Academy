package test1.esercizio8e9;

public class TestScuola {
	public static void main(String[] args) {

//		Studente s1 = new Studente("Mario", "Rossi", 20);
//		s1.calcolaMediaVoti(7, 8, 9);
//		s1.studia();
//		System.out.println(s1);
//
//		Insegnante i1 = new Insegnante("Anna", "Bianchi", 40, "Matematica");
//		i1.insegna();
//		System.out.println(i1);

		Persona studente1 = new Studente("Mario", "Rossi", 20);
		Persona insegnante1 = new Insegnante("Anna", "Bianchi", 40, "Matematica");

		if (studente1 instanceof Studente && insegnante1 instanceof Insegnante) {
			((Studente) studente1).studia(); // cast
			((Insegnante) insegnante1).insegna(); // cast
		} else {
			System.out.println("Non fanno parte dell'istanza");
		}

		((Studente) studente1).calcolaMediaVoti(4, 5, 7, 8, 10, 10);
		; // cast

	}

}
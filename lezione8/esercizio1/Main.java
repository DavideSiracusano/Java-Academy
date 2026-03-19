package lezione8.esercizio1;

public class Main {

	public static void main(String[] args) {

		ClasseProva prova = new ClasseProva();

		prova.overload();
		prova.overload("stringa dal main");
		prova.overload("stringa e intero dal main", 1);

	}

}

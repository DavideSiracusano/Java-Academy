package test.esercizio3;

public class Main {
public static void main (String[] args) {
	Animale animale1 = new Animale("Ettore", "Cane", 11);
	Appartamento appartamento1 = new Appartamento("Reggia", "Via Reggia", 12);
	Automobile automobile1 = new Automobile("Fiat", 500, 2021);

	
	System.out.println(animale1.nome);
	System.out.println(appartamento1.nome);
	System.out.println(automobile1.marca);

	

	
}
}

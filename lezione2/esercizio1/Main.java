package lezione2.esercizio1;

public class Main {
public static void main (String[] args) {
	// costruttore parametrizzato
	
	Animale animale1 = new Animale ("Ettore", "Gatto", 12);
	
	System.out.println("eta di " + animale1.nome + " è " + animale1.eta);
	
	// costruttore vuoto
	Appartamento appartamento1 = new Appartamento ();
	
	appartamento1.nome = "Raya";
	appartamento1.via = "roma";
	appartamento1.numeroCivico = 10;
	
	System.out.println(appartamento1.nome);
	
}
}

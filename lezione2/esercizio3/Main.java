package lezione2.esercizio3;

public class Main {
	
	public static void main(String[] args) {
		
		//costruttore parametrizzato e richiama metodo che prende il nome del viaggio scelto
		
		Viaggio viaggio1 = new Viaggio("Corea", "Seul", 7, 1200);
		
		viaggio1.stampaInfo();
	}
	
}

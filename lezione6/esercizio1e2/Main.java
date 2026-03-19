package lezione6.esercizio1e2;

public class Main {
	
	public static void main(String[] args) {
				
		Telefono telefono1 = new Telefono("+3992203020", 15); //dichiarazione, creazione e inizializzazione
		
		Telefono telefono2 = new Telefono(); //dichiarazione
		
		telefono2.setNumero("320245942"); //inizializzazione
		
		telefono1.chiama(telefono2.getNumero());
		telefono1.creditoResiduo();
		telefono1.chiamataEffettuata();
		telefono1.ricarica(5);
		telefono1.richiama();
	}
}


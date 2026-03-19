package lezione4.esercizio6;

public class Main {
	
	public static void main(String[] args) {
		
		//valore casuale
		double raggio = 5;
		
		//creazione oggetto
		Cerchio mioCerchio = new Cerchio(raggio);
		
		//richiama i metodi dalla classe Cerchio
		double circonferenza = mioCerchio.calcolaCirconferenza();
		
		double area = mioCerchio.calcolaArea();
		
		//stampa
		 System.out.println("Raggio: " + raggio);
	     System.out.println("Circonferenza: " + circonferenza);
	     System.out.println("Area: " + area);
	}

}

package lezione2.esercizio3;

public class Viaggio {
	
	String nomeViaggio;
	String nomeLocalita;
	int durataViaggio;
	int costo;
	
	
	//costruttore
	
	public Viaggio(String nomeViaggio, String nomeLocalita, int durataViaggio, int costo) {
		this.nomeViaggio = nomeViaggio;
		this.nomeLocalita = nomeLocalita;
		this.durataViaggio = durataViaggio;
		this.costo = costo;
		
	}
	
	//metodo stampa
	
	public void stampaInfo () {
		System.out.println("Hai scelto il viaggio " + this.nomeViaggio);
	}
}

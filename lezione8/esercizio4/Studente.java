package lezione8.esercizio4;

public class Studente {
	
	private String nome;
	private String cognome;
	private double isee;
	private int annoCorso;
	
	public Studente() {}
	
	public Studente(String nome, String cognome, double isee, int annoCorso) {
		this.nome = nome;
		this.cognome = cognome;
		this.isee = isee;
		this.annoCorso = annoCorso;
		
	}
	
	// metodi getter e setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setIsee(double isee) {
		this.isee = isee;
	}
	public void setAnnoCorso(int annoCorso) {
		this.annoCorso = annoCorso;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public double getIsee() {
		return isee;
	}
	public int getAnnoCorso() {
		return annoCorso;
	}
	
	
	
	public double calcolaTassa() {
	    double tassaBase = 0;

	    if (isee < 10000) {
	        tassaBase = 500;
	    } else if (isee >= 10000 && isee < 30000) {
	        tassaBase = 700;
	    } else if (isee >= 30000) {
	        tassaBase = 1200;
	    }

	    return tassaBase;
	}
	

}

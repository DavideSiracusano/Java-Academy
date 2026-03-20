package test2.esercizio7;

public class Scatola {
	
	private double altezza;
	private double lunghezza;
	private double profondita;
	
	public Scatola(double altezza, double lunghezza, double profondita) throws UndiscoveredDimensionException {
	    if (altezza < 0 || lunghezza < 0 || profondita < 0) {
	        throw new UndiscoveredDimensionException("Dimensioni non valide!");
	    }
	    this.altezza = altezza;
	    this.lunghezza = lunghezza;
	    this.profondita = profondita;
	}
	
	//getter e setter
	public double getAltezza() {
	    return altezza;
	}
	public double getLunghezza() {
	    return lunghezza;
	}
	public double getProfondita() {
	    return profondita;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public void setlunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}

	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}
	
	// metodo per verificare se una scatola può essere contenuta in un altra
	public boolean isContenuta(Scatola scatola) {
		if (scatola.altezza <= this.altezza && scatola.lunghezza <= this.lunghezza && scatola.profondita <= this.profondita) {
		    return true; //contenuta
		}
		return false;
	}
	
	public boolean isEqual(Scatola scatola) {
		if (scatola.altezza == this.altezza && scatola.lunghezza == this.lunghezza && scatola.profondita == this.profondita) {
		    return true;
		}
		return false;
	}


}

package lezione2.esercizio2;

public class Quadrato {

     int lato;

    // Costruttore
    public Quadrato(int lato) {
        this.lato = lato;
    }

    // Metodo per il perimetro
    public int calcolaPerimetro() {
        return lato * 4;
    }

    // Metodo per l'area
    public int calcolaArea() {
        return lato * lato;
    }

 
}

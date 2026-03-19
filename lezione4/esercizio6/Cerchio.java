package lezione4.esercizio6;
/*
 * Creare una classe Cerchio con una variabile di classe final chiamata PI_GRECO 
 * e che valga 3,14.Questa classe deve avere un metodo main con una variabile chiamata raggio 
 * che abbia un valorescelto dal programmatore e che stampi a schermo la circonferenza 
 * e l’area del cerchio. La classedeve avere un metodo 
 * che calcoli la circonferenza ed un altro metodo che calcoli l’area del cerchio.
 */

public class Cerchio {

	    public static final double PI_GRECO = 3.14;

	    private double raggio;

	    // Costruttore per impostare il raggio
	    public Cerchio(double raggio) {
	        this.raggio = raggio;
	    }

	    // Metodo per calcolare la circonferenza
	    public double calcolaCirconferenza() {
	        return 2 * PI_GRECO * raggio;
	    }

	    // Metodo per calcolare l'area
	    public double calcolaArea() {
	        return PI_GRECO * raggio * raggio;
	    }
}

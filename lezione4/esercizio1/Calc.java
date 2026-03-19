package lezione4.esercizio1;

public class Calc {
	
	// Metodo per la somma
    public static int somma(int a, int b) {
        return a + b;
    }

    // Metodo per la sottrazione
    public static int sottrazione(int a, int b) {
        return a - b;
    }

    // Metodo per la moltiplicazione
    public static int moltiplicazione(int a, int b) {
        return a * b;
    }

    // Metodo per la divisione
    public static int divisione(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Errore: divisione per zero!");
            return 0; // oppure puoi lanciare un'eccezione
        }
    }
	}


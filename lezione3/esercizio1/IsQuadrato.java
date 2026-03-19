package lezione3.esercizio1;

public class IsQuadrato {
	

	    public static void main(String[] args) {
	    	
	    	//stampa se è un quadrato in base ai lati uguali

	        int lato1 = 5;
	        int lato2 = 5;
	        int lato3 = 5;
	        int lato4 = 5;

	        if (lato1 == lato2 && lato2 == lato3 && lato3 == lato4) {
	            System.out.println("È un quadrato");
	        } else {
	            System.out.println("Non è un quadrato");
	        }

	    }
	}




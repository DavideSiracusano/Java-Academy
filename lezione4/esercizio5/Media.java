package lezione4.esercizio5;

public class Media {
	
	  //metodo per fare la media aritmetica dell'array di numeri

    public static double media(int[] numeri) {

        int somma = 0;

        for(int i = 0; i < numeri.length; i++) {
            somma += numeri[i];
        }

        return (double) somma / numeri.length; //cast per numero double 
    }



    public static void main(String[] args) {

        int[] numeri = {2, 4, 5};

        double risultato = media(numeri);

        System.out.println("La media è: " + risultato);
    }
    
    }



package lezione4.esercizio10;

public class ConfrontoNumeri {

    public static void main(String[] args) {

        int numero1 = 8; // primo numero
        int numero2 = 5; // secondo numero
        
        //confronta se il primo è maggiore

        if(numero1 > numero2) {
            System.out.println(numero1 + " è maggiore di " + numero2);
        } else if(numero1 < numero2) {
            System.out.println(numero1 + " è minore di " + numero2);
        } else {
            System.out.println(numero1 + " e " + numero2 + " sono uguali");
        }

    }

}
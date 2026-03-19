package lezione4.esercizio12;

public class Triangolo {

    public static void main(String[] args) {

        // Lunghezze dei lati (modifica a piacere)
        int lato1 = 5;
        int lato2 = 5;
        int lato3 = 5;

        // Controllo il tipo di triangolo
        if(lato1 == lato2 && lato2 == lato3) {
            System.out.println("Triangolo equilatero");
        } else if(lato1 == lato2 || lato1 == lato3 || lato2 == lato3) {
            System.out.println("Triangolo isoscele");
        } else {
            System.out.println("Triangolo scaleno");
        }

    }

}

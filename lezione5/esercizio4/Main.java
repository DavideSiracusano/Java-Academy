package lezione5.esercizio4;
import java.util.Scanner;

//Creare una classe Java che abbia all’interno un array 
//di stringhe scelte dal programmatore. Stampare l’array a schermo.

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] array = new String[4]; // array di 4 nomi

        System.out.println("Inserisci 3 nomi:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            array[i] = input.nextLine(); // inserisce il nome nell'array tramite indice
        }

        System.out.println("\nNomi inseriti:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        input.close();
    }
}
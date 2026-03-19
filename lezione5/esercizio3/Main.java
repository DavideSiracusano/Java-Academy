package lezione5.esercizio3;
import java.util.Scanner;

//Creare una classe Java che abbia all’interno un array di interi 
//contenente i numeri dispari da -3 a 11. Stampare l’array a schermo.

public class Main {
	
	public static void main(String [] args) {
		
		int[] array = {-3, 2, 6, 7, 9, 10, 11};
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				System.out.println("i numeri " + array[i] + " sono dispari");
			}
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("inserisci il1 numero");
		int numero = input.nextInt();
		
		if (numero % 2 != 0) {
			System.out.println("il numero è dispari");
		}
		else {
			System.out.println("il numero è dispari");
		}
		
		input.close();
		
	}

}

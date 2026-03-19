package lezione5.esercizio1;

//Creare una classe Java che abbia all’interno un array di interi contenente i numeri da 0 a 9. 
//Stampare l’array a schermo

public class Main {
	
	public static void main(String[] args) {
		
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println("array:");
		for(int i = 0; i < array.length; i++ ) {
			System.out.println(array[i]);
		}
		
	}

}

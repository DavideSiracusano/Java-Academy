package lezione5.esercizio2;

//Creare una classe Java che abbia all’interno un array di 
//interi contenente i numeri pari da 0 a 12. Stampare l’array a schermo.


public class Main {
	
	public static void main(String[] args) {
		
		int[] array = {0,1,2,5,6,8,9,12};
		
		//stampare solo i numeri pari
		
		for(int i = 0 ; i < array.length; i++) {
			if(array[i] % 2 == 0) { //se il numero ciclato è divisibile per due ovvero pari
				System.out.println("i numeri " + array[i] + "sono pari");
			}
		}
		
		
	}

}

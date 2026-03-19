package lezione3.esercizio2;

public class Check {
	
	public static void main (String[] args) {
		char[] vocali =  {'a', 'e', 'i', 'o', 'u'}; //array di vocali
		char c = 'a'; //vocale
		boolean isVocale = false; 
		

        for (char v : vocali) {   // scorre tutte le vocali
            if (c == v) {
                isVocale = true;
                break;             // esce appena trova la corrispondenza
            }
        }
        
        
		if (isVocale) {
			System.out.println(c + " è una vocale");
		} else {
			System.out.println("non è una vocale");
		}
	}
	

}

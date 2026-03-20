package test2.esercizio7;

public class Main {
	
	public static void main(String[] args)  {
		
		
		try {
			Scatola scatola1 = new Scatola(5, 5, 10);
			Scatola scatola2 = new Scatola(5, 5, 10);
			Scatola scatola3 = new Scatola(2, 1, 1);

			// verifica se le scatole sono uguali
			if(scatola1.isEqual(scatola2)) {
				System.out.println( "la scatola è uguale " );
			}
			
			// verifica se la scatola2 è contenuta nella scatola3
			if(scatola3.isContenuta(scatola2)) {
				System.out.println("la scatola è contenuta nella scatola scelta " );

			} else {
				System.out.println("la scatola non è contenuta nella scatola scelta " );

			}
			


			
		} catch (UndiscoveredDimensionException e){
			System.out.println(e.getMessage()); //restituisce messsaggio inserito
		}
	}

}

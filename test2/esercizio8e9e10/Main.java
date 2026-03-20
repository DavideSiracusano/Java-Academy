package test2.esercizio8e9e10;

public class Main {
	
	  // metodo statico FUORI dal main per contare per sistema
    public static void contaPerSistemaOperativo(GestioneInventario inventario) {
    	int windows = 0;
    	int macos = 0;
    	int linux = 0;
    	int android = 0;
    	int ios = 0;

    	for (Dispositivo d : inventario.getDispositivi()) {
    	    if (d.getSistemaOperativo() == SistemaOperativo.WINDOWS) {
    	        windows++;
    	    }else if (d.getSistemaOperativo() == SistemaOperativo.MACOS) {
    	        macos++;
    	    }else if (d.getSistemaOperativo() == SistemaOperativo.LINUX) {
        	        linux++;
    	    }else if (d.getSistemaOperativo() == SistemaOperativo.ANDROID) {
    	        android++;
    	     }else if (d.getSistemaOperativo() == SistemaOperativo.IOS) {
   	    	 ios++;
    	    } 
    	    
    	   
    	}
    	System.out.println("inventario composto da " + " windows: " + windows  + "," + " macos: "  + macos + ","+  " linux: " + linux  + ","+ " android: "  +  android  + ","+ " ios: " +  ios);
    }

    // metodo statico FUORI dal main per capire il dispositivo
    public static void usaDispositivo(Dispositivo d) {
        if (d instanceof Computer c) {
            c.inserisciPeriferica("a2");
        } else if (d instanceof Smartphone s) {
            s.mandaMessaggio(3204050, "Hellooo");
        }
    }
	
	public static void main(String[] args) {
		
		Dispositivo computer = new Computer("Lenovo", "a7", SistemaOperativo.WINDOWS);
		Dispositivo computer2 = new Computer("Acer", "a5", SistemaOperativo.WINDOWS);

		Dispositivo smartphone = new Smartphone("Samsung", "s22", SistemaOperativo.ANDROID);
		Dispositivo smartphone2 = new Smartphone("Iphone", "15", SistemaOperativo.IOS);

		GestioneInventario inventario = new GestioneInventario();
		
		System.out.println(computer.getDettagli());
		System.out.println(smartphone.getDettagli());
		
		inventario.aggiungereDispositivo(smartphone);
		inventario.aggiungereDispositivo(computer);
		inventario.aggiungereDispositivo(computer2);
		inventario.aggiungereDispositivo(smartphone2);


		
		inventario.rimuovereDispositivo(smartphone);
		
		inventario.stampaDettagli();
		
		//chiamare i metodi statici
		contaPerSistemaOperativo(inventario);
	    usaDispositivo(computer);
	    usaDispositivo(smartphone2);
		
		

		
	}

}

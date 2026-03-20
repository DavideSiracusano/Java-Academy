package test2.esercizio8e9e10;
import java.util.ArrayList;


public class GestioneInventario {
	
	private ArrayList<Dispositivo> dispositivi;
	
	public GestioneInventario() {
		dispositivi = new ArrayList<>();
	}
	
	public void aggiungereDispositivo(Dispositivo dispositivo) {
		dispositivi.add(dispositivo);
		System.out.println("dispositivo " + dispositivo.getModello() + " aggiunto");

	}
	
	public void rimuovereDispositivo(Dispositivo dispositivo) {
		dispositivi.remove(dispositivo);
		System.out.println("dispositivo " + dispositivo.getModello() + " rimosso" );
	}
	
	public void stampaDettagli() {
        System.out.println("Lista: ");

	    for (Dispositivo d : dispositivi) {
	        System.out.println(d.getDettagli());
	    }
	}
	
	//metodo get dispositivo
	public ArrayList<Dispositivo> getDispositivi() {
	    return dispositivi;
	}

}

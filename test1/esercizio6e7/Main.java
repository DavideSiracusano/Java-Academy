package test1.esercizio6e7;

public class Main {

	public static void main(String[] args) {

		//due utenti
        ContrattoFisso fisso = new ContrattoFisso(12345, "Standard", "Via Roma 1");
        ContrattoMobile mobile = new ContrattoMobile(67890, "Premium", "Vodafone");

        // serie di telefonate
        int[] chiamateFisso = {120, 300, 60}; // in secondi
        int[] chiamateMobile = {180, 240, 60};

        System.out.println("Chiamate utente fisso:");
        for (int sec : chiamateFisso) {
            System.out.println("Durata " + sec + " sec - Costo: €" + fisso.costoChiamata(sec));
        }

        System.out.println("\nChiamate utente mobile:");
        for (int sec : chiamateMobile) {
            System.out.println("Durata " + sec + " sec - Costo: €" + mobile.costoChiamata(sec));
        }

        // Bollette finali
        System.out.println("\nBolletta finale utente fisso: €" + fisso.getBolletta());
        System.out.println("Bolletta finale utente mobile: €" + mobile.getBolletta());
    }
}

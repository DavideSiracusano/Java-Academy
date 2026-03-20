package test2.esercizio3;
//Si realizzi un’applicazione che astragga il funzionamento di una squadra sportiva. 

//All’interno della Squadra ci dovrà essere una Lista di 
//tutti i giocatori ed un attributo che rappresenta il capitale sociale della squadra, nonché un attributo per il nome. 
//Dovranno essere forniti metodi che permettano di:
//•Acquistare giocatori, aggiungendoli alla lista e sottraendo il prezzo del Giocatore al capitale sociale della squadra
//•Vendere giocatori, sottraendoli dalla lista ed aggiungendo il prezzo di vendita del giocatore al capitale sociale della squadra

public class Main {

	public static void main(String[] args) {

		Squadra squadra = new Squadra("Italia", 2000000);
		Giocatore giocatore1 = new Giocatore("Luigi", 1000);

		giocatore1.toString();

		squadra.acuistaGiocatori(giocatore1);
		squadra.stampaSquadra();
		squadra.vendiGiocatori(giocatore1);
		squadra.stampaSquadra();

	}

}

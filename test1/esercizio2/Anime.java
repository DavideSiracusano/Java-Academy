package test1.esercizio2;

//Creare una classe che astragga un concetto relativo ad un vostro hobby o interesse di qualsiasi tipo 
//(es. Videogioco, Anime, SerieTv, Animale, ecc.), individuare almeno quattro attributi. La classe, 
//inoltre, dovrà contenere sia un costruttore vuoto che un costruttore parametrizzato ed inoltre 
//dovranno essere implementati sia un inizializzatore di classe che d’istanza. 
//Istanziare nel metodo main() almeno un oggetto di tale classe e stamparne a video i dettagli

public class Anime {

	String nome;
	String genere;
	String autore;
	int anno;

	// costruttore vuoto
	public Anime() {
	};

	// costruttore parametrizzato
	public Anime(String nome, String genere, String autore, int anno) {
		this.nome = nome;
		this.genere = genere;
		this.autore = autore;
		this.anno = anno;
	}

	// inizializzatore static di classe
	static {
		System.out.println("Inizializzatore statico eseguito");

	}

	// inizializzatore di istanza
	{
		System.out.println("Inizializzatore d'istanza eseguito");
		if (nome == null)
			nome = "Sconosciuto";
		if (genere == null)
			genere = "Sconosciuto";
		if (autore == null)
			autore = "Sconosciuto";
		if (anno == 0)
			anno = 2000;
	}
	
	  // Override del metodo toString
    @Override
    public String toString() {
        return "Anime{" +
               "nome='" + nome + '\'' +
               ", genere='" + genere + '\'' +
               ", autore='" + autore + '\'' +
               ", anno=" + anno +
               '}';
    }

}

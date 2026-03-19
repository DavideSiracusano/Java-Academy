package lezione10.esercizio1;

public enum Cardinal {

	NORD, NORD_NORD_EST, NORD_EST, EST_NORD_EST, EST, EST_SUD_EST, SUD_EST, SUD_SUD_EST, SUD, SUD_SUD_OVEST, SUD_OVEST,
	OVEST_SUD_OVEST, OVEST, OVEST_NORD_OVEST, NORD_OVEST, NORD_NORD_OVEST;

	// metodo per verificare opposto
	public Cardinal isOpposite() {
		Cardinal[] all = Cardinal.values(); // tutte le costanti
		int index = (this.ordinal() + 8) % 16; // indice di partenza più 8 (vedendo la disposizione oraria)
		return all[index]; // ritorna il valore preso

	}

	// verifica se un'altra direzione è opposta a questa
	public boolean isOppositeOf(Cardinal other) {
		return this.isOpposite() == other;
	}

	public static Cardinal mix(Cardinal cardinal1, Cardinal cardinal2) {
		Cardinal[] all = Cardinal.values(); // tutte le costanti
		int index1 = cardinal1.ordinal(); // si prende indice del primo cardinale
		int index2 = cardinal2.ordinal(); // si prende indice del primo cardinale
		int indexFounded = (index1 + index2) / 2; // trova indice che sta nel mezzo tra i due punti
		return all[indexFounded];

	}

}

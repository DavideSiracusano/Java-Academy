package test1.esercizio8e9;

public class Insegnante extends Persona {

	private String materia;

	public Insegnante(String nome, String cognome, int eta, String materia) {
		super(nome, cognome, eta);
		this.materia = materia;
	}

	// Getter e setter per materia
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	// Override di toString()
	@Override
	public String toString() {
		return super.toString() + ", Insegna: " + materia;
	}

	// Metodo insegna
	public void insegna() {
		System.out.println(getNome() + " sta insegnando " + materia + "...");
	}
}

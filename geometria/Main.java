package geometria;

public class Main {
	public static void main(String[] args) {
		Cerchio cerchio = new Cerchio(2.5);
		Triangolo triangolo = new Triangolo(2, 4, 4, 10, 20);
		Quadrato quadrato = new Quadrato(4);

		cerchio.calcolaArea(); // stampa direttamente area cerchio
		cerchio.calcolaPerimetro(); // stampa direttamente perimetro cerchio
		System.out.println("--------------");
		triangolo.calcolaArea(); // stampa direttamente area triangolo
		triangolo.calcolaPerimetro(); // stampa direttamente perimetro cerchio
		System.out.println("--------------");
		quadrato.calcolaArea(); // stampa direttamente area quadrato
		quadrato.calcolaPerimetro(); // stampa direttamente perimetro quadrato

	}

}

package lezione10.esercizio2e3;

public class Test {

	public static void main(String[] args) {
		Coppia<Integer> coppia = new Coppia<>();
//		Coppia<String> coppia1 = new Coppia<>();  -> error

		coppia.set(2, 4);

		System.out.println("Primo numero: " + coppia.getUno());
		System.out.println("Secondo numero: " + coppia.getDue());

		System.out.println("------------------------");
		CoppiaMista<Integer, String> coppiaMista = new CoppiaMista<>();
		coppiaMista.set(1, "ciao");
		coppiaMista.toString();
		System.out.println("coppia mista " + coppiaMista.getUno().getClass() + " " + coppiaMista.getDue().getClass()); // per
																														// restituire
																														// tipo

	}

}

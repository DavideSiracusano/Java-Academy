package lezione8.esercizio2e3;

public class Calcolatrice {

	// costruttore vuoto
	public Calcolatrice() {
	}

	// SOMMA
	public double somma(double a, double b) {
		return a + b;
	}

	public double somma(double a, double b, double c) {
		return a + b + c;
	}

	public double somma(double a, double[] numeri) {
		double risultato = a;
		for (double n : numeri) {
			risultato += n; // Ogni numero dell’array viene sommato con risultato.
		}
		return risultato;
	}

	// SOTTRAZIONE
	public double sottrazione(double a, double b) {
		return a - b;
	}

	public double sottrazione(double a, double b, double c) {
		return a - b - c;
	}

	public double sottrazione(double a, double[] numeri) {
		double risultato = a;
		for (double n : numeri) {
			risultato -= n; // Ogni numero dell’array viene sottratto con risultato.
		}
		return risultato;
	}

	// DIVISIONE
	public double divisione(double a, double b) {
		return a / b;
	}

	public double divisione(double a, double b, double c) {
		return a / b / c;
	}

	public double divisione(double a, double[] numeri) {
		double risultato = a;
		for (double n : numeri) {
			risultato /= n; // Ogni numero dell’array viene diviso con risultato.
		}
		return risultato;
	}

	// MOLTIPLICAZIONE
	public double moltiplicazione(double a, double b) {
		return a * b;
	}

	public double moltiplicazione(double a, double b, double c) {
		return a * b * c;
	}

	public double moltiplicazione(double a, double[] numeri) {
		double risultato = a;
		for (double n : numeri) {
			risultato *= n; // Ogni numero dell’array viene moltiplicato con risultato.
		}
		return risultato;
	}

}
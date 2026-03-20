package test2.esercizio8e9e10;

//Sottoclasse Smartphone
class Smartphone extends Dispositivo {
public Smartphone(String marca, String modello, SistemaOperativo sistemaOperativo) {
   super(marca, modello, sistemaOperativo);
}

public void mandaMessaggio(int i, String testo) {
   System.out.println("Invio SMS a " + i + " dallo smartphone " + getModello() + ": " + testo);
}
}

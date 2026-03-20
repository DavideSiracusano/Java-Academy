package test2.esercizio8e9e10;

//Sottoclasse Computer
class Computer extends Dispositivo {
public Computer(String marca, String modello, SistemaOperativo sistemaOperativo) {
   super(marca, modello, sistemaOperativo);
}

public void inserisciPeriferica(String periferica) {
   System.out.println("Periferica '" + periferica + "' collegata al computer " + getModello());
}
}

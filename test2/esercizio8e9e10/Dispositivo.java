package test2.esercizio8e9e10;

//Classe Base
class Dispositivo {
 private String marca;
 private String modello;
 private SistemaOperativo sistemaOperativo;

 public Dispositivo(String marca, String modello, SistemaOperativo sistemaOperativo) {
     this.marca = marca;
     this.modello = modello;
     this.sistemaOperativo = sistemaOperativo;
 }

 public String getDettagli() {
     return "Marca: " + marca + ", Modello: " + modello + ", OS: " + sistemaOperativo;
 }

 // Getters per utilità
 
 public String getModello() {
	 return modello;
	 }
 
 
 public SistemaOperativo getSistemaOperativo() {
	    return sistemaOperativo;
	}
 
}





package Nivell_1.S1_01_Nivell1Ex1.Modules;

public class Corda extends Instrument {
	
	public Corda(String nom, int preu) {
		super(nom, preu);	
	}
	
	//Getters
	
	
	//Setters
	
	
	//Metodes propis
	public String toString() {
		return super.getNom() + " de tipus Corda, amb un preu de " + super.getPreu() + "€";
	}
	
	public String tocar() {
		return "Esta sonant un instumrent de Corda";
	}
}

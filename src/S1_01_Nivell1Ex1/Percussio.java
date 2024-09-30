package S1_01_Nivell1Ex1;

public class Percussio extends Instrument {
	
	public Percussio(String nom, int preu) {
		super(nom, preu);	
	}
	
	//Getters
	
	
	//Setters
	
	
	//Metodes propis
	public String toString() {
		return super.getNom() + " de tipus precussió, amb un preu de " + super.getPreu() + "€";
	}
	
	public String tocar() {
		return "Esta sonant un instumrent de de percussió";
	}

}

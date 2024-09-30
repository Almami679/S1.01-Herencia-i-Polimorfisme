package S1_01_Nivell1Ex1;

public class Vent extends Instrument {

	public Vent(String nom, int preu) {
		super(nom, preu);	
	}
	
	//Getters
	
	
	//Setters
	
	
	//Metodes propis
	public String toString() {
		return super.getNom() + " de tipus vent, amb un preu de " + super.getPreu() + "€";
	}
	
	public String tocar() {
		return "Esta sonant un instumrent de vent";
	}

}

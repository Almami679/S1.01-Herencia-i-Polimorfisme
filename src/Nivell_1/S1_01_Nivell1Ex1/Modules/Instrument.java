package Nivell_1.S1_01_Nivell1Ex1.Modules;

public abstract class Instrument {
	
	private String nom;
	private int preu;
	
	//Constructor
	public Instrument(String nom, int preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	//Getters
	public String getNom() {
		return this.nom;
	}
	
	public int getPreu() {
		return this.preu;
	}
	
	//Setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPreu(int preu) {
		this.preu = preu;
	}
	
	//Metodes propis
	public abstract String toString();
	
	public abstract String tocar();
	

}

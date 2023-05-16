package model;

public class Voiture extends VehiculeMotorise {

	public Voiture(String modele, Moteur moteur) {
		super(modele, moteur);
	}
	
	public void rouler(int consommation) {
		utiliser(consommation);
	}
	
}

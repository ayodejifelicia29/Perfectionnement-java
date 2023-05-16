package model;

public class Moto extends VehiculeMotorise {

	public Moto(String modele, Moteur moteur) {
		super(modele, moteur);
	}
	
	public void rouler(int consommation) {
		utiliser(consommation);
	}
	
}

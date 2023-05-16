package model;

public class VehiculeMotorise extends Vehicule {
	private Moteur moteur;
	
	public VehiculeMotorise(String modele, Moteur moteur) {
		super(modele);
		this.moteur = moteur;
	}
	
	public boolean demarrer() {
		return moteur.demarrer();
	}
	
	public void arreter() {
		moteur.arreter();
	}
	
	public void faireLePlein(int quantite) {
		moteur.faireLePlein(quantite);
	}
	
	public void utiliser(int consommation) {
		moteur.utiliser(consommation);
	}

}

package model;

public class Moteur {
	private int carburant;

	public Moteur(int carburant) {
		this.carburant = carburant;
	}
	
	public boolean demarrer() {
		if(carburant > 0) {
			carburant--;
			System.out.println("Le moteur démarre, le niveau de carburant " + carburant);
			return true;
		}else {
			System.out.println("Le moteur ne peut pas démarrer, le niveau de carburant est insuffisant");
			return false;
		}
	}
	
	public void utiliser(int consommation) {
		if(consommation <= carburant) {
			carburant-=consommation;
			System.out.println("Le moteur est utilisé, niveau de carburant : " + carburant);
		}else {
			System.out.println("Le niveau de carburant est insuffisant pour effectuer ce trajet");
		}
	}
	
	public void arreter() {
		System.out.println("Le moteur s'arrête");
	}
	
	public void faireLePlein(int quantite) {
		carburant += quantite;
		System.out.println("Le plein est fait, niveau de carburant : " + carburant) ;
	}
	
	
}

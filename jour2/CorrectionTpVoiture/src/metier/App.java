package metier;

import model.Moteur;
import model.Voiture;

public class App {
	public static void main(String[] args) {
		Moteur v8 = new Moteur(60);
		Voiture ferrari = new Voiture("Ferrari Fxxx", v8);
		
		int consommationTrajet = 10;
		int quantitePlein = 60;
		int nombreTrajets = 7;
		
		
		for(int i =1; i<= nombreTrajets; i++ ) {
			System.out.println("Trajet : " + i);
			ferrari.rouler(consommationTrajet);
		}
		
		ferrari.faireLePlein(quantitePlein);
		
	}
}

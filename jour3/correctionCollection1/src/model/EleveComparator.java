package model;

import java.util.Comparator;

public class EleveComparator implements Comparator<Eleve>{

	@Override
	public int compare(Eleve e1, Eleve e2) {
		int nomComparaison = e1.getNom().compareTo(e2.getNom());
		// si e1 est < à e2, -> -1
		// si e1 est > à e2, ->  1
		// si e1 est = à e2, ->  0
		if(nomComparaison !=0) {
			return nomComparaison;
			// si les noms de famille sont identique alors on doit comparer les prénoms
		}else {
			return e1.getPrenom().compareTo(e2.getPrenom());
		}
	}
}

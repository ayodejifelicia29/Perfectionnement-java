package metier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


import arrayList.Eleve;
import arrayList.Repertoire;



public class App {
	
	 public static void main(String[] args) {
	       
	        
	        ArrayList<Eleve> listeEleves = new ArrayList<>();
	        
	  

	       for(int i =0; i < 4 ; i ++) {

	    	   listeEleves.add(new Eleve());
			}
	       
	       // Comparateur personnalisé pour trier les élèves par nom puis par prénom
	       
	        Comparator<Eleve> comparateur = Comparator.comparing(Eleve::getNom)
	                .thenComparing(Eleve::getPrenom);

	        // Trier la liste des élèves en utilisant le comparateur personnalisé
	        
	        Collections.sort(listeEleves, comparateur);

	        System.out.println("Liste des élèves :");
	        for (Eleve eleve : listeEleves) {
	            System.out.println(eleve.toString());
	        
	        }
	        
	        System.out.println("\n--------------------");
	        
	        Repertoire repertoire = new Repertoire();
	        
	        // Ajouter des contacts
	        repertoire.ajouterContact("Alice", "063044015");
	        repertoire.ajouterContact("Bob", "076543210");
	        repertoire.ajouterContact("Charlie", "0678901234");
	        
	       
	        // Récupérer les numéros de téléphone
	        
	     // Récupérer les numéros de téléphone
	        String numeroAlice = repertoire.recupererTel("Alice");
	        String numeroBob = repertoire.recupererTel("Bob");
	        String numeroCharlie = repertoire.recupererTel("Charlie");
	        
	       /* HashMap<Repertoire,String> map = new HashMap <>();
            map.put(repertoire, "");
            
            String valeur = map.get(repertoire);*/

	        
	        
	     // Afficher les numéros de téléphone
	        System.out.println("Numéro de téléphone d'Alice : " +  numeroAlice) ;
	        System.out.println("Numéro de téléphone de Bob : " +   numeroBob );
	        System.out.println("Numéro de téléphone de Charlie : " +  numeroCharlie);
	    }
	 

}

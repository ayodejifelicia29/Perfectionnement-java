package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		
		// tableaux
		String[] eleves = new String[3];
		// initialisation apres declaration
		int[] notes = new int[3];
		
		eleves[0]= "John";
		eleves[1]= "Bob";
		eleves[2]= "Sam";
		
		notes[0]=12;
		notes[1]=16;
		notes[2]=14;
		
		// initialisation lors de la déclaration
		int[] annees = {1990, 1980, 1950, 1930};
		
		System.out.println(annees[3]);
		
		annees[3] = 1999;
		
		System.out.println(annees[3]);
		System.out.println("\n");
		
		for(int i = 0; i<annees.length; i++) {
			System.out.println(annees[i]);
		}
		System.out.println("\n");
		
		for(int annee : annees) {
			System.out.println(annee);
		}
		
		
		// ArrayList
		ArrayList<Integer> listeEntiers = new ArrayList<>();  
		listeEntiers.add(50);
		listeEntiers.add(80);
		listeEntiers.add(100);
		
		listeEntiers.set(2, 200);
		
		System.out.println("\n");
		
		for(int i = 0; i<listeEntiers.size(); i++) {
			System.out.println(listeEntiers.get(i));
		}
		
		System.out.println("\n");
		
		for(int number : listeEntiers) {
			System.out.println(number);
		}
		System.out.println("\n--------------------");
		// recuperer la taille 
		int dernierElement = listeEntiers.size() - 1;
		// ajouter une valeur
		listeEntiers.add(20);
		// recuperer une valeur
		int firstValue = listeEntiers.get(0);
		// supprimer une valeur 
		listeEntiers.remove(2);
		// vider mon arrayList
	//	listeEntiers.clear();
		
		System.out.println("\n--------------------");
		System.out.println(listeEntiers.get(dernierElement));
		System.out.println("\n--------------------");
		// HASHMAP
		
		HashMap<String, String> dictionnaire = new HashMap<>();
		HashMap<String, Integer> collectionTimbre = new HashMap<>();
		
		// rajouter des valeurs 
		dictionnaire.put("bonjour", "Mot employé pour saluer...");
		dictionnaire.put("au revoir", "autre definition....");
		
		collectionTimbre.put("nom du timbre", 2);
		collectionTimbre.put("nom du timbre 2", 10);
		collectionTimbre.put("nom du timbre 3", 4);
		
		System.out.println(dictionnaire);
		System.out.println(collectionTimbre);
		
		// verifier qu'une clé existe dans la hashmap
		boolean exist = dictionnaire.containsKey("bonjour");
		
		System.out.println(exist);
		System.out.println("\n--------------------");
		
		// supprimer une valeur se fait avec la clé
		dictionnaire.remove("au revoir");
		
		// parcourir avec un foreach
		
		for(HashMap.Entry<String, String> entry : dictionnaire.entrySet()) {
			String clé = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(clé + " : " + value);
		}
		System.out.println("\n--------------------");
		//--------------------- EXEMPLE REDEFINITION EQUALS -----------------------------------------------
		
		Personne perso1 = new Personne("Alice", 25);
		Personne perso2 = new Personne("Alice", 25);
		
		HashMap<Personne, String> map = new HashMap<>();
		
		map.put(perso1, "valeur 1");
		
		String valeur = map.get(perso2);
		
		System.out.println("valeur dans la hashmap : " + valeur);
		
	}
}

package metier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import model.Eleve;
import model.EleveComparator;

public class App {
	public static void main(String[] args) {
		ArrayList<Eleve> eleves = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i <3; i++){
			System.out.println("Saisir le nom de l'élève");
			String nom = scanner.nextLine();
			System.out.println("Saisir le prenom de l'élève");
			String prenom = scanner.nextLine();
			
			Eleve eleve = new Eleve(nom, prenom);
			eleves.add(eleve);
		}
		
		System.out.println(eleves);
				
		Collections.sort(eleves, new EleveComparator());
		
		System.out.println(eleves);
	}
}

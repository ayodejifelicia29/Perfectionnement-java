package arrayList;

import java.util.Scanner;

public class Eleve {
	private String nom;
	private String prenom;
	
	
	public Eleve() {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de l'élève : ");
        this.nom = scanner.nextLine();

        System.out.print("Entrez le prénom de l'élève : ");
        this.prenom = scanner.nextLine();
		
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	 @Override
	    public String toString() {
	        return "Nom : " + nom + ", Prénom : " + prenom;
	    }
	
}

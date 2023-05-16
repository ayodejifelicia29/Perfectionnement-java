package collections;

import java.util.Objects;

public class Personne {
	private String nom;
	private int age;
	
	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// redefintion de la méthode equals pour comparer le contenu plutot que la reference
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Personne other = (Personne) obj;
		return nom.equals(other.nom) && age == other.age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nom, age);
	}
	
}

package model;

import java.util.HashMap;

public class Repertoire {
	private HashMap<String, String> contacts;
	
	public Repertoire() {
		contacts = new HashMap<>();
	}
	
	
	
	public HashMap<String, String> getContacts() {
		return contacts;
	}



	public void setContacts(HashMap<String, String> contacts) {
		this.contacts = contacts;
	}



	public void ajouterContact(String nom, String tel) {
		contacts.put(nom, tel);
	}
	
	public String recupererTel(String nom) {
		return contacts.get(nom);
	}
}

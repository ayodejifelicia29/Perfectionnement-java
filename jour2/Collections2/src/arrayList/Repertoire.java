package arrayList;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Repertoire {
	private Map<String ,String>contacts;

	public Repertoire() {
		 contacts = new HashMap<>();
		
	}
	public void ajouterContact(String nom, String numeroTel) {
        contacts.put(nom, numeroTel);
    }

    public String recupererTel(String nom) {
        return contacts.get(nom);
    }
    
    
    @Override
	public boolean equals (Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj ==null || getClass() != obj.getClass()) {
			return false;
		}
		return contacts.equals(contacts);
	}
   @Override
   public int hashCode() {
	   return Objects.hash(contacts);
   }

}

package metier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Repertoire;

public class App {

	public static void main(String[] args) {
		Repertoire repertoire = new Repertoire();
		
		repertoire.ajouterContact("Alice", "0123456789");
		repertoire.ajouterContact("John", "0145019865");
		repertoire.ajouterContact("Bob", "0999999999");
		
		//List<Map.Entry<String, String>> entries = new ArrayList<>(repertoire.getContacts().entrySet());
		
		// avec le stream on peut comparer rapidement
		List<Map.Entry<String, String>> entries = repertoire.getContacts().entrySet().stream()
				.sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
		
		Collections.sort(entries, Map.Entry.comparingByKey());
		
		for(Map.Entry<String, String> entry : entries) {
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " " + value);
		}
		
		
		System.out.println("\n");
		System.out.println(repertoire.recupererTel("Alice"));
	}

}

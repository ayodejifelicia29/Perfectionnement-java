package metier;

import java.util.Scanner;

import model.Letter;
import model.Parcel;
import model.PostalItem;

public class App {
	public static void main(String[] args) {
		PostalItem[] mailbox = new PostalItem[2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i <mailbox.length; i++) {
			System.out.println("Merci de saisir les details de votre objet postal " + (i+ 1) + " :");
			
			System.out.println("Destinataire :");
			String dest = scanner.nextLine();
			
			System.out.println("Adresse :");
			String adress = scanner.nextLine();
			
			System.out.println("Code postal :");
			String cp = scanner.nextLine();
			
			System.out.println("Ville :");
			String city = scanner.nextLine();
			
			System.out.println("Recommande (true/false) :");
			boolean registered = scanner.nextBoolean();
			scanner.nextLine();
			
			if(i % 2 == 0) {
				System.out.println("Poids (en grammes) :");
				double weight = scanner.nextDouble();
				scanner.nextLine();
				mailbox[i] = new Parcel(dest, adress, cp, city, registered, weight);
			}else {
				System.out.println("Urgent  (true/false) :");
				boolean urgent = scanner.nextBoolean();
				scanner.nextLine();
				
				mailbox[i] = new Letter(dest, adress, cp, city, registered, urgent);
			}
			System.out.println();
		}
		
		for(int i =0; i<mailbox.length; i++) {
			System.out.println("** Objet Postal N" + i + " :");
			System.out.println(mailbox[i]);
			System.out.println("Cout affranchissement :" + mailbox[i].calculatePostage() + " euros");
			System.out.println();
		}
		
		scanner.close();
	}
}

package model;

public class Letter extends PostalItem{
	
	private boolean urgent;

	public Letter(String recipient, String recipientAdress, String postalCode, String destinationCity,
			boolean registered, boolean urgent) {
		super(recipient, recipientAdress, postalCode, destinationCity, registered);
		this.urgent = urgent;
	}
	
	public double calculatePostage() {
		double basePrice = 0.53;
		double postage = basePrice;
		
		if(isRegistered()) {
			postage += 1.5;
		}
		
		if(urgent) {
			postage += 0.6;
		}
		
		return postage;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	@Override
	public String toString() {
		return super.toString() + "\nUrgent :" + (urgent? " oui" : "non");
	}
	
	

}

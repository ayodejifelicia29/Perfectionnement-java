package model;

public class PostalItem {
	private String recipient;
	private String recipientAdress;
	private String postalCode;
	private String destinationCity;
	private boolean registered;
	
	public PostalItem(String recipient, String recipientAdress, String postalCode, String destinationCity,
			boolean registered) {
		this.recipient = recipient;
		this.recipientAdress = recipientAdress;
		this.postalCode = postalCode;
		this.destinationCity = destinationCity;
		this.registered = registered;
	}
	
	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getRecipientAdress() {
		return recipientAdress;
	}

	public void setRecipientAdress(String recipientAdress) {
		this.recipientAdress = recipientAdress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	@Override
	public String toString() {
		return "Nom : " + recipient + ", Adresse :" + recipientAdress + ", "
				+ postalCode + " " + destinationCity + ", recommandé : " + (registered ? "oui" : "non");
	}

	public double calculatePostage() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
}

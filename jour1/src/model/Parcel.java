package model;

public class Parcel extends PostalItem{
	private double weight;
	
	public Parcel(String recipient, String recipientAdress, String postalCode, String destinationCity,
			boolean registered, double weight) {
		super(recipient, recipientAdress, postalCode, destinationCity, registered);
		this.weight = weight;
	}
	
	public double calculatePostage() {
		double basePrice = 0.8;
		double postage = Math.ceil(weight/100) * basePrice;
		
		if(isRegistered()) {
			postage += 3.0;
		}
		
		return postage;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString() +  "\nPoids :" + weight + "kg";
	}
	
	
	
	


}

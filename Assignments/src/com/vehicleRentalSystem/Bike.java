package com.vehicleRentalSystem;

public class Bike extends Vehicle {
	public Bike(String vehicleNumber, String model, double ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
	}

	@Override
	public void calculateRent() {
		this.rent = ratePerDay * days * 0.9;
	}

	@Override
	public void displayDetails() {
		System.out.println("Bike | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + this.rent);
	}
	
	
}

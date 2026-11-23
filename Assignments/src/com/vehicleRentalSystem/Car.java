package com.vehicleRentalSystem;

public class Car extends Vehicle{
	double insuranceChargePerDay;
	
	public Car(String vehicleNumber, String model, double ratePerDay, int days, double insuranceChargePerDay) {
		super(vehicleNumber, model, ratePerDay, days);
		this.insuranceChargePerDay = insuranceChargePerDay;		
	}

	@Override
	public void calculateRent() {
		this.rent = (ratePerDay + insuranceChargePerDay) * days;
	}

	@Override
	public void displayDetails() {
		System.out.println("Car  | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + this.rent);
	}
	
	
}

package com.vehicleRentalSystem;

public class Vehicle {
	String vehicleNumber;
	String model;
	double ratePerDay;
	int days;
	double rent;
	
	public Vehicle(String vehicleNumber, String model, double ratePerDay, int days) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.ratePerDay = ratePerDay;
		this.days = days;
	}
	
	public void calculateRent() {
		this.rent = ratePerDay * days;
	}
	
	public void displayDetails() {
		System.out.println(vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + rent);
	}
}

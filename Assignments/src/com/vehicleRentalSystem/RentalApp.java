package com.vehicleRentalSystem;

import java.util.Scanner;

public class RentalApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of vehicles: ");
		int numOfVehicles = scanner.nextInt()	;
		scanner.nextLine();
		Vehicle[] vehicles= new Vehicle[numOfVehicles];
		
		for (int i = 0; i < numOfVehicles; i++) {
			System.out.print("Enter type (1-Car, 2Bike): ");
			int vType = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Enter Vehicle Number: ");
			String vNumber = scanner.nextLine();
			
			System.out.print("Enter Model: ");
			String vModel = scanner.nextLine();
			
			System.out.print("Enter Rate per Day: ");
			double vRatePerDay = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.print("Enter Days: ");
			int vDays = scanner.nextInt();
			scanner.nextLine();
			
			if(vType == 1) {
				System.out.print("Enter Insurance per Day: ");
				double vInsurancePerDay = scanner.nextDouble();
				scanner.nextLine();
				vehicles[i] = new Car(vNumber, vModel, vRatePerDay, vDays, vInsurancePerDay);
			} else {
				vehicles[i] = new Bike(vNumber, vModel, vRatePerDay, vDays);
			}
			
		}
		
		System.out.println("--- Rental Details ---");
		
		for ( Vehicle v : vehicles) {
			v.calculateRent();
			v.displayDetails();
		}
		
		scanner.close();
	}

}

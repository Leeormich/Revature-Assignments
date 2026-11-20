import java.util.Scanner;
public class EmployeeSalaryProcessing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employeeID: ");
		int employeeID = scanner.nextInt();
		System.out.println("Enter Employee Name: ");
		String employeeName = scanner.next();
		System.out.println("Enter Employee Salary: ");
		double employeeSalary = scanner.nextDouble();
		System.out.println("Enter Employee Bonus Percentage: ");
		double bonusPercentage = scanner.nextDouble();
		System.out.println("Enter Employee Active Status (true/false): ");
		boolean isActive = scanner.nextBoolean();
		
		double bonusAmount = employeeSalary * (bonusPercentage / 100);
		double totalSalary = employeeSalary + bonusAmount;
		boolean salAboveThreshold = totalSalary > 75000;
		employeeName = employeeName.toUpperCase();
		StringBuilder nameReversed = new StringBuilder(employeeName).reverse();
		
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Employee name: " + employeeName);
		System.out.println("Basic Salary: " + employeeSalary);
		System.out.println("Bonus " + bonusAmount);
		System.out.println("Final Salary: " + totalSalary);
		System.out.println("Active: " + isActive);
		System.out.println("Reversed Name: " + nameReversed.toString());
		System.out.println("Salary above 75000: " + salAboveThreshold);
		
		
		scanner.close();

	}

}

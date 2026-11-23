
import java.util.Scanner;

public class CnvrtStrtoWrap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an age: ");
		String ageInput = scanner.nextLine();
		System.out.println("Enter a salary: ");
		String salaryInput = scanner.nextLine();
		System.out.println("Enter active: ");
		String activeInput = scanner.nextLine();
		
		Integer age = Integer.valueOf(ageInput);
		Double salary = Double.valueOf(salaryInput);
		Boolean active = Boolean.valueOf(activeInput);
		salary = salary * 1.1; // Increase salary by 10%
		System.out.println("Age: " + age + " Data type: " + ((Object)age).getClass().getSimpleName());
		System.out.println("Salary: " + salary + " Data type: " + ((Object)salary).getClass().getSimpleName());
		System.out.println("Active: " + active + " Data type: " + ((Object)active).getClass().getSimpleName());
		
		scanner.close();
	}

}

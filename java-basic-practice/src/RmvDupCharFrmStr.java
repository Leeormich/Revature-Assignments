import java.util.Scanner;

public class RmvDupCharFrmStr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		StringBuilder input = new StringBuilder(scanner.nextLine());
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (result.indexOf(String.valueOf(currentChar)) == -1) {
				 result.append(currentChar);
			}
		}
		
		System.out.println("String after removing duplicates: " + result.toString());
								
		scanner.close();
	}

}

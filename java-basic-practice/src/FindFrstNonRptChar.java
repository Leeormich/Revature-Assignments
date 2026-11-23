import java.util.Scanner;

public class FindFrstNonRptChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		
		// find the first non-repeating character or output a message if all characters are repeating
		boolean found = false;
		for (char ch : input.toCharArray()) {
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println("The first non-repeating character is: " + ch);
				found = true;
				break;
			} 
		}
		if (!found) {
			System.out.println("All characters are repeating.");
		}
		
		scanner.close();
	}

}

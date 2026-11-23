import java.util.Scanner;

public class FindLngstSubStrWthoutRep {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		
		StringBuilder longestSubstring = new StringBuilder();
		StringBuilder currentSubstring = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			int repeatedIndex = currentSubstring.indexOf(String.valueOf(currentChar));

			if (repeatedIndex == -1) {
				currentSubstring.append(currentChar);
			} else {
				currentSubstring.delete(0, repeatedIndex + 1);
				currentSubstring.append(currentChar);
			}

			if (currentSubstring.length() > longestSubstring.length()) {
				longestSubstring = new StringBuilder(currentSubstring);
			}
		}
		System.out.println("The length of the longest substring without repeating characters is: " + longestSubstring.length());
		System.out.println("The longest substring without repeating characters is: " + longestSubstring.toString());
		
		scanner.close();
	}

}
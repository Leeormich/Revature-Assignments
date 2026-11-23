import java.util.Scanner;

public class CountVowelAndCons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		
		int vowelCount = 0;
		int consonantCount = 0;
		
		for (char ch : input.toCharArray()) {
			if (Character.isLetter(ch)) {
				ch = Character.toLowerCase(ch);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}
		
		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of consonants: " + consonantCount);
		
		scanner.close();

	}

}

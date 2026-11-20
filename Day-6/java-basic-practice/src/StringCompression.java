import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();

		StringBuilder compressed = new StringBuilder();
		int count = 0;
		char currentChar = input.charAt(0);
		
		for (char ch : input.toCharArray()) {
			if (ch == currentChar) {
				count++;
			} else {
				compressed.append(currentChar);
				compressed.append(count);
				currentChar = ch;
				count = 1;
			}
		}
		compressed.append(currentChar);
		compressed.append(count);
		
		System.out.println("Compressed string: " + compressed.toString());
		
		scanner.close();
	}

}

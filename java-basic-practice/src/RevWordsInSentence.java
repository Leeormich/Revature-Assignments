import java.util.Scanner;
public class RevWordsInSentence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();

		StringBuilder reversed = new StringBuilder();
		int substringEnd = input.length() - 1;
		int substringStart = substringEnd;
		for (int i = substringEnd; i >= 0; i--) {
			if (input.charAt(i) == ' ' || i == 0) {
				if (i == 0) {
					substringStart = 0;	
				} else {
					substringStart = i + 1;
				}
				reversed.append(input.substring(substringStart, substringEnd + 1));
				reversed.append(' ');
				substringEnd = i - 1;
			}
			
			
		}
		
		System.out.println("Reversed words in the sentence: " + reversed.toString());
		scanner.close();
	}

}

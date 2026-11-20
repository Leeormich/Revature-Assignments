import java.util.Scanner;

public class ChkAnagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = scanner.nextLine().trim().toLowerCase();
		System.out.println("Enter the second string: ");
		String str2 = scanner.nextLine().trim().toLowerCase();
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		if (charArray1.length != charArray2.length) {
			System.out.println("The strings are not anagrams.");
		} else {
			java.util.Arrays.sort(charArray1);
			java.util.Arrays.sort(charArray2);
			
			if (java.util.Arrays.equals(charArray1, charArray2)) {
				System.out.println("The strings are anagrams.");
			} else {
				System.out.println("The strings are not anagrams.");
			}
		}
		scanner.close();
	}
	
}

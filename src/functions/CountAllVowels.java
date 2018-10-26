package functions;

import java.util.Scanner;

public class CountAllVowels {

	public static void main(String[] args) {
		CountAllVowels(input());

	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("Input a string of characters: ");
		inputs = scanner.nextLine();
		return inputs;

	}

	public static void CountAllVowels(String inputs) {
	
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y', 'å', 'ä', 'ö' };
		
		int sum = 0;
		for (int i = 0; i < inputs.length(); i++) {

			for (int j = 0; j < vowels.length; j++) {

				if ((""+inputs.charAt(i)).equalsIgnoreCase(""+vowels[j])) {
					sum++;

				}
				
			}
		}
		System.out.println("The amount of vowels is: " + sum);
	}

}
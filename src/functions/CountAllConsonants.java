package functions;

import java.util.Scanner;

public class CountAllConsonants {

	public static void main(String[] args) {
		CountAllConsonants(input());

	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("Input a string of characters: ");
		inputs = scanner.nextLine();
		return inputs;

	}

	public static void CountAllConsonants(String inputs) {

		char[] consonants = { 'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b',
				'n', 'm' };

		int sum = 0;
		for (int i = 0; i < inputs.length(); i++) {

			for (int j = 0; j < consonants.length; j++) {

				if (("" + inputs.charAt(i)).equalsIgnoreCase("" + consonants[j])) {
					sum++;

				}

			}
		}
		System.out.println("The amount of consonants is: " + sum);
	}

}

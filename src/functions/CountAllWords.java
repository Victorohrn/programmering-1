package functions;

import java.util.Scanner;

public class CountAllWords {

	public static void main(String[] args) {
		CountAllWords(input());
	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("Input a sentence: ");
		inputs = scanner.nextLine();
		inputs = inputs.trim();

		return inputs;

	}

	public static void CountAllWords(String inputs) {
		int sum = 1;
		boolean foundSpace = false;
		for (int i = 0; i < inputs.length(); i++) {
			if (inputs.charAt(i) == (' ')) {
				if (foundSpace == false) {
					sum++;
					foundSpace = true;
				}
			} else {
				foundSpace = false;
			}

		}
		System.out.println("The amount of words are: " + sum);
	}
}

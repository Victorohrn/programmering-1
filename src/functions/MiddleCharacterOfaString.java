package functions;

import java.util.Scanner;

public class MiddleCharacterOfaString {

	public static void main(String[] args) {
		middleCharacterOfaString(input());
	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("Input a string of characters: ");
		inputs = scanner.nextLine();
		return inputs;
	}

	public static void middleCharacterOfaString(String inputs) {

		if (inputs.length() % 2 == 0) {
			System.out.println("Even");
			System.out.println(inputs.charAt(inputs.length() / 2 - 1) + "" + inputs.charAt(inputs.length() / 2));
		} else {
			System.out.print("The middle character of a string is: ");
			System.out.print(inputs.charAt(inputs.length() / 2));

		}

	}
}

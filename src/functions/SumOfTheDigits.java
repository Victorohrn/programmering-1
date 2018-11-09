package functions;

import java.util.Scanner;

public class SumOfTheDigits {

	public static void main(String[] args) {
		sumofdigits(input());
	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("input a number: ");
		inputs = scanner.nextLine();
		return inputs;

	}

	public static void sumofdigits(String inputs) {
		int sum = 0;
		for (int i = 0; i < inputs.length(); i++) {
			sum += Character.getNumericValue(inputs.charAt(i));
		}
		System.out.println("The sum of the integer is: " + sum);
	}
}

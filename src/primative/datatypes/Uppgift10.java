package primative.datatypes;

import java.util.Scanner;

public class Uppgift10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a number: ");
			double number1 = scanner.nextDouble();
			System.out.print("Enter a number: ");
			double number2 = scanner.nextDouble();

			if (number1 == 15) {
				System.out.println("True");
				break;
			}
			if (number2 == 15) {
				System.out.println("True");
				break;
			}

			if (number1 + number2 == 15) {
				System.out.println("True");
				break;
			}

			if (number1 - number2 == 15) {
				System.out.println("True");
				break;
			}
			if (number2 - number1 == 15) {
				System.out.println("True");
				break;
			}
		}
	}
}
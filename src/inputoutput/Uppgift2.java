package inputoutput;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a firstnumber: ");
			double number1 = scanner.nextDouble();
			System.out.print("Enter a secondnumber: ");
			double number2 = scanner.nextDouble();
			System.out.println("" + number1 + " + " + number2 + " = " + (number1 + number2));
			System.out.println("" + number1 + " - " + number2 + " = " + (number1 - number2));
			System.out.println("" + number1 + " x " + number2 + " = " + number1 * number2);
			System.out.println("" + number1 + " / " + number2 + " = " + number1 / number2);
			System.out.println("" + number1 + " mod " + number2 + " = " + number1 % number2);
			break;

		}

	}

}

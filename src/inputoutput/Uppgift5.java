package inputoutput;

import java.util.Scanner;

public class Uppgift5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the first number: ");
			double num1 = scanner.nextDouble();
			System.out.println("Enter the second number: ");
			double num2 = scanner.nextDouble();
			System.out.println("Enter the third number: ");
			double num3 = scanner.nextDouble();
			System.out.println("The average = " + (num1 + num2 + num3) / 3);

		}
	}

}

package printing;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter Text: ");
		String name = inputScanner.nextLine();
		System.out.println("Hello " + name);
		System.out.print("Enter your age: ");
		int age = inputScanner.nextInt();
		if (age > 120) {
			System.out.println("You lying piece of shit!");
			System.exit(0);
		} else if (age < 5) {
			System.out.println("You must be older!");
			System.exit(0);
		} else {
			System.out.println("So your age is: " + age);
		}
		System.out.print("Enter your weight: (Enter weight in Kg)");

		double weight = inputScanner.nextDouble();
		if (weight > 120) {
			System.out.println("Damn!");
		}

		System.out.println("So your weight is: " + weight);
	}

}

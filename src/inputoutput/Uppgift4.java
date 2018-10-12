package inputoutput;

import java.util.Scanner;

public class Uppgift4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter radius of a cirkle: ");
			double num1 = scanner.nextDouble();
			System.out.println("Perimeter is: " + 2 * Math.PI * num1);
			System.out.println("Area is: " + Math.PI * (num1 * num1));

		}
	}

}

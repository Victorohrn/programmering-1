package inputoutput;

import java.util.Scanner;

public class Uppgift6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter the height of the rektangle: ");
			double h = scanner.nextDouble();
			System.out.print("Enter the width of the rektangle: ");
			double w = scanner.nextDouble();
			if (h == w) {
				System.out.println("Thats not a rektangle");
				break;
			} else {
				System.out.println("Area is: " + "" + h + " * " + w + " = " + h * w);
				System.out.println("Perimeter is: " + " 2 * " + " ( " + h + " + " + w + " ) " + " = " + 2 * (h + w));

			}
		}

	}

}

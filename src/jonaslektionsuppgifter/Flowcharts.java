package jonaslektionsuppgifter;

import java.util.Scanner;

/**
 * Returns largest among three
 * 
 * @author victor.ohrn
 */
public class Flowcharts {
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Start
		int a, b, c; // declare variables a,b and c
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three whole numbers");
		// read a,b and c
		System.out.println("Enter the first number: ");
		a = input.nextInt(); // read a
		System.out.println("Enter the second number: ");
		b = input.nextInt(); // read b
		System.out.println("Enter the third number: ");
		c = input.nextInt(); // read c
		// is a > b?
		if (a > b) {
			// a > b == true
			// is a larger than c?
			if (a > c) {
				// true
				System.out.println(a);
			} else {
				// false
				System.out.println(c);
			}
		} else {
			// a < b == false
			// is b > c?
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
	}

}

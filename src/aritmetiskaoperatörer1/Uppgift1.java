package aritmetiskaoperatörer1;

import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a uglynumber: ");
			double uglynumber = scanner.nextDouble();
			if (uglynumber % 2 == 0 || uglynumber % 3 == 0 || uglynumber % 5 == 0) {
				System.out.println("Thats not a uglynumber");
				break;
			} else {
				System.out.println("That is an uglynumber");
			}
		}
	}
}

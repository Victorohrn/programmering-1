package inputoutput;

import java.util.Scanner;

public class Uppgift8 {

	public static void main(String[] args) {
		int[] binary = { 1, 10, 100, 1000, 10000, 100000 };
		int[] nonbinary = { 1, 2, 4, 8, 16, 32, 64 };

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int sum = 0;
			System.out.println("Enter a Binarynumber: ");
			String input = scanner.nextLine();
			

			char[] inputCharArray = input.toCharArray();
			int[] inputIntArray = new int[inputCharArray.length];
			for(int i = 0; i < inputCharArray.length; i++) {
				inputIntArray[i] = (int) inputCharArray[i];
			}
					
					
			if (input.equalsIgnoreCase("quit")) {
				System.out.println("Quitting");
				break;
			}
			for (int i = 0; i < nonbinary.length; i++) {
				for (int j = 0; j < nonbinary.length; j++) {
					if (inputIntArray[i] == nonbinary[j]) {
						sum += binary[j];

					}
				}
			}
			System.out.println("Sum = " + sum);
		}
	}
}

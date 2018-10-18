package printing;

import java.util.Scanner;

public class RomanNumbers {

	public static void main(String[] args) {
		char[] romNumbers = { 'I', 'IV', 'V', 'L', 'C', 'D', 'M' };
		int[] valRomNumbers = { 1, 5, 10, 50, 100, 500, 1000 };

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int sum = 0;
			System.out.println("Enter a roman number: ");
			String input = scanner.nextLine();
			char[] inputCharArray = input.toCharArray();
			if (input.equalsIgnoreCase("quit")) {
				System.out.println("Quitting");
				break;
			}
			for (int i = 0; i < inputCharArray.length; i++) {
				// System.out.println(inputCharArray[i] + ":" + i);
				for (int j = 0; j < romNumbers.length; j++) {
					// System.out.println(romNumbers[j] + ": i = " + i + " :j = " + j);
					if (inputCharArray[i] == romNumbers[j]) {
						// System.out.println("True");
						sum += valRomNumbers[j];

					}
				}
			}
			System.out.println("Sum = " + sum);
		}
	}
}
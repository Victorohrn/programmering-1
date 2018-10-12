package inputoutput;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a number: ");
			int number1 = scanner.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println("" + number1 + " x " + i + " = " + number1 * i);
			}
			break;
		}
	}

}

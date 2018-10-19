package inputoutput;

import java.util.Scanner;

public class Uppgift7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a varible: ");
			String a = scanner.nextLine();
			System.out.println("Enter a second a variable: ");
			String b = scanner.nextLine();
			System.out.println("a: " + a + " b: " + b);
			String c = "";
			c = a;
			a = b;
			b = c;
			System.out.println("a: " + a + " b: " + b);

		}

	}

}

package functions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leapyear(input());
	}

	public static int input() {
		Scanner scanner = new Scanner(System.in);
		int inputs;
		System.out.println("input a year: ");
		inputs = scanner.nextInt();
		return inputs;

	}

	public static void leapyear(int inputs) {
		boolean leap = ((inputs % 4 == 0) && (inputs % 100 != 0) || (inputs % 400 == 0));

		if (leap) {
			System.out.println(inputs + " is a leapyear");
		} else {
			System.out.println(inputs + " is not a leapyear");
		}
	}
}

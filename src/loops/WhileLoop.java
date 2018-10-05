package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
		System.out.print("Enter a number: ");
		double number1 = scanner.nextDouble();
		System.out.print("Enter a number: ");
		double number2 = scanner.nextDouble();
		
		System.out.println(number1 + " * " + number2 + " = " + number1 * number2);
		
		if (number1 == 0 && number2 == 0) {
			break;
		}
		}
	}

}

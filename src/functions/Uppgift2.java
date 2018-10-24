package functions;

import java.util.Scanner;


public class Uppgift2 {

	public static void main(String[] args) {
		averageofthree(input());
	}

	public static double[] input() {
		Scanner scanner = new Scanner(System.in);
		double[] inputs = new double[3];
		System.out.println("Input first number: ");
		inputs[0] = scanner.nextInt();
		System.out.println("Input second number: ");
		inputs[1] = scanner.nextInt();
		System.out.println("Input third number: ");
		inputs[2] = scanner.nextInt();
		return inputs;
	}

	public static void averageofthree(double[] inputs) {
		double tempVar;
		tempVar = inputs[0] + inputs[1] + inputs[2];
		System.out.println("The average is: " + tempVar/3);
		
	}
}

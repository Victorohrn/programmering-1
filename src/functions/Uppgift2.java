package functions;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		largestAmongThree(input());
	}

	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.println("Input first number: ");
		inputs[0] = scanner.nextInt();
		System.out.println("Input second number: ");
		inputs[1] = scanner.nextInt();
		System.out.println("Input third number: ");
		inputs[2] = scanner.nextInt();
		return inputs;
	}

	public static void largestAmongThree(int[] inputs) {
		int tempVar;
		if (inputs[0] > inputs[1]) {
			tempVar = inputs[0];
		} else {
			tempVar = inputs[1];
			System.out.println("Largest number is: ");
		}
		if (tempVar > inputs[2]) {
			System.out.println(tempVar);
		} else {
			System.out.println(inputs[2]);
		}
	}
}

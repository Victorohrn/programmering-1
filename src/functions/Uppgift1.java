package functions;

import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		smallestAmongThree(input());
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

	public static void smallestAmongThree(int[] inputs) {
		int tempVar;
		System.out.print("Smallest number is: ");
		if (inputs[0] < inputs[1]) {
			tempVar = inputs[0];
		} else {
			tempVar = inputs[1];
		}
		if (tempVar < inputs[2]) {
			System.out.println(tempVar);
		} else {
			System.out.println(inputs[2]);
		}
	}

	public static void largestAmongThree(int[] inputs) {
		int tempVar1;
		System.out.print("Largest number is: ");
		if (inputs[0] > inputs[1]) {
			tempVar1 = inputs[0];
		} else {
			tempVar1 = inputs[1];
		}
		if (tempVar1 > inputs[2]) {
			System.out.println(tempVar1);
		} else {
			System.out.println(inputs[2]);
		}
	}
}

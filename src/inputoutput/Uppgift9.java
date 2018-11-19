package inputoutput;

import java.util.Scanner;

public class Uppgift9 {

	public static void main(String[] args) {
		binaryMultiply(input());
	}

	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[2];
		System.out.println("Input the first binary number: ");
		array[0] = scanner.nextInt();
		System.out.println("Input the binary number that you want to multiply with");
		array[1] = scanner.nextInt();
		return array;

	}

	public static void binaryMultiply(int[] inputs) {
		
	}

}

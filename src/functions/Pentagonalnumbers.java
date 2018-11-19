package functions;

import java.util.Scanner;

public class Pentagonalnumbers {
	public static void main(String[] args) {
		while (true) {
		Scanner scanner = new Scanner(System.in);
		int input1;
		int input2;
		System.out.println("Enter the first pentagonal number you want to see: ");
		input1 = scanner.nextInt();
		System.out.println("Enter the last pentagonal number you want to see: ");
		input2 = scanner.nextInt();
		if (input1) {
			break;
		}else {
		int count = 1;
		for (int i = input1; i <= input2; i++) {
			System.out.printf("%-6d", pentagonalnumbers(i));
			if (count % 10 == 0)
				System.out.println();
			count++;
		}
	}
		}
	}

	public static int pentagonalnumbers(int i) {
		return (i * (3 * i - 1)) / 2;
	}
}
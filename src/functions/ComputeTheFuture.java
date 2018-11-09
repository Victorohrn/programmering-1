package functions;

import java.util.Scanner;

public class ComputeTheFuture {

	public static void main(String[] args) {
		future(input());
	}

	public static double[] input() {
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[3];
		System.out.println("Input the investment amount: ");
		array[0] = scanner.nextDouble();
		System.out.println("Input the rate of interset");
		array[1] = scanner.nextDouble();
		System.out.println("input number of years ");
		array[2] = scanner.nextDouble();
		return array;
	}

	public static void future(double[] array) {
		array[1] = array[1] / 100 + 1;
		for (int i = 1; i <= array[2]; i++) {
			array[1] = Math.pow(array[1], i);
			double totIntrest = (Math.pow(array[1], i));
			System.out.println(array[0] * totIntrest);
		}
	}
}

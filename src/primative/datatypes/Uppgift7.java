package primative.datatypes;

import java.util.Scanner;

public class Uppgift7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a integer that you want absolute value from: ");
		int j = scanner.nextInt();
		int i = Math.abs(j);
		System.out.println("The absolute value from " + j + " is: "  +  i);
		}
	}

}

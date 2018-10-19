package jämförelseoperatorer;

import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a first interger: ");
			int int1 = scanner.nextInt();
			System.out.println("Enter a second integer: ");
			int int2 = scanner.nextInt();

			if (int1 !=  int2) {
				System.out.println(int1 + " != " + int2);

			} else {
				System.out.println(int1 + " = " + int2);
			}
			if (int1 < int2) {
				System.out.println(int1 + " < " + int2);
			} else {
				System.out.println(int1 + " > " + int2);
			}
			if (int1 <= int2) {
				System.out.println(int1 + " <= " + int2);
			} else {
				System.out.println(int1 + " => " + int2);
			}
		}
	}

}

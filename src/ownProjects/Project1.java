package ownProjects;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		morseCode(input());
	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("input a sentence you want to translate: ");
		inputs = scanner.nextLine();
		return inputs;
	}

	public static void morseCode(String inputs) {
		String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "	---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < chars.length; i++) {

			System.out.println(morse[i]);
		}
	}
}
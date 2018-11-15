package functions;

import java.util.Scanner;

public class BetweenTwoCharacters {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputs1;
		String inputs2;
		System.out.println("input character1: ");
		inputs1 = scanner.next();
		System.out.println("input character2: ");
		inputs2 = scanner.next();
		betweentwochars(inputs1, inputs2);
	}

	public static void betweentwochars(String inputs1, String inputs2) {
		String characters[] = { "(", ")", "*", "+", ",", "-", ".", "/", "0", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", ":", ";", "<", "=", ">", "?", "@", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
				"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "[", "\"", "]", "^", "_", "`", "a",
				"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
				"w", "x", "y", "z" };
		String input[] = { inputs1, inputs2 };
		for (int i = 0; i < characters.length; i++) {
			if (input[0].equals(characters[i])) {
				for (int j = i; j < characters.length; j++) {
					System.out.print(characters[j + 1]);
					if (input[1].equals(characters[j + 2])) {
						break;
					}
				}
			}
		}
	}
}

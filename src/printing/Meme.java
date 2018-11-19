package printing;

import java.util.Scanner;

public class Meme {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String s = scanner.nextLine();
		while (true) {
			System.out.println(s);
			if (s == "q") {
				System.out.println("Quitting");
				break;
			}
		}
	}

}

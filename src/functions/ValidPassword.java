package functions;

import java.util.Scanner;

public class ValidPassword {

	public static void main(String[] args) {
		validPass(input());
	}
	
	public static String input() {
		System.out.println("1. A password must have at least eight characters.");
		System.out.println("2. A password consists of only letters and digits.");
		System.out.println("3. A password must contain at least two digits");
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("Input valid password: ");
		inputs = scanner.nextLine();
		return inputs;

	}

	public static void validPass(String inputs) {
		
		
		if (inputs.length() == 10 || inputs   {
			
		}
		
		System.out.println(inputs);
		
	}
}

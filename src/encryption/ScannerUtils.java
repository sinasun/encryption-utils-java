package encryption;

import java.util.Scanner;

public class ScannerUtils {
	public static Scanner input;

	/**
	 * Print and gets menu options from user
	 * 
	 * @param options: the string list of options that menu should print
	 * 
	 * 
	 * @return selected option by user
	 */

	public static int getMenuItem(String... options) {
		String message = "";
		for (int i = 0; i < options.length; i++) {
			message += String.format("%d - %s\r\n", i + 1, options[i]);
		}
		return getInt(message, 1, options.length);
	}

	/**
	 * Gets String input from user
	 * 
	 * @param prompt: String it should print to user
	 * @return return the input
	 */

	public static String getString(String prompt) {
		System.out.println(prompt);
		return input.nextLine();

	}

	/**
	 * Gets int input from user
	 * 
	 * @param prompt: String it should print to user
	 * @param min:    Minimum accepted int that user can input
	 * @param max:    Maximum accepted int that user can input
	 * @return inputed int by user
	 */
	public static int getInt(String prompt, int min, int max) {

		boolean isInputBad = true;
		boolean hasNextInt;
		int value = 0;

		while (isInputBad) {
			System.out.println(prompt);

			hasNextInt = input.hasNextInt();
			if (hasNextInt) {
				value = input.nextInt();
				if (value >= min && value <= max) {

					isInputBad = false; // break out of loop

				} else {
					System.out.println("Please select a number in the range");

				}
			} else {
				System.out.println("Please enter an integer");
			}
			input.nextLine(); // clean up input stream
		}

		return value;

	}
}

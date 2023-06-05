
/**
* Student Name: Sina Khodaveisi
* Student Number: 041066567
* Course: CST8132 Object Oriented Programming
* Program: CET-CS-Level 2
* Professor: Fedor Ilitochev
*
*/
import java.util.ArrayList;
import java.util.Scanner;

import encryption.EncryptionType;
import encryption.ScannerUtils;

/**
 * This class is for menu option handling and getting inputs from user.
 * 
 * @author Sina Khodaveisi
 * @version 1.0
 * @since 1.0
 **/
public class Lab5Test {

	/**
	 * To keep all encrypted string in a array and run the menu and
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Encryption tester");

		ScannerUtils.input = new Scanner(System.in);
		// array to save the encrypt list
		ArrayList<String> encryptedText = new ArrayList<String>();

		boolean exit = false;
		while (!exit) {
			int menuOption = ScannerUtils.getMenuItem("Encrypt text", "Decrypt text", "Display encrypted list", "Exit");

			switch (menuOption) {
			// For encrypt text
			case 1: {

				String text = ScannerUtils.getString("Please enter text to be encrypted:");
				EncryptionType encryptMethod = EncryptionType.getMethod();

				encryptedText.add(encryptMethod.encrypt(text));
				System.out.printf("Encrypted value #%d is: %s%n", encryptedText.size(),
						encryptedText.get(encryptedText.size() - 1));
				break;
			}
			// For decrypt text
			case 2: {
				if (encryptedText.size() == 0) {
					System.out.println("Nothing to decrypt");
					break;
				}
				int num = ScannerUtils.getInt("Message number you want to decrypt:", 1, encryptedText.size());
				EncryptionType encryptMethod = EncryptionType.getMethod();

				System.out.printf("Decrypted value #%d is: %s%n", num,
						encryptMethod.decrypt(encryptedText.get(num - 1)));

				break;
			}
			// to display encrypted list
			case 3: {
				if (encryptedText.size() == 0) {
					System.out.println("Nothing to display");
					break;
				}
				for (int i = 0; i < encryptedText.size(); i++) {
					System.out.printf("#%d: %s%n", i + 1, encryptedText.get(i));
				}
				break;
			}
			// exit
			case 4: {
				exit = true;
				break;
			}

			}

		}
		System.out.println("Good Bye!");
	}
}

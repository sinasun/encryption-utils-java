package encryption;

/**
 * Vigenere Encryption method
 * 
 * @author Sina Khodaveisi
 * @version 1.0
 * @since 1.0
 **/
public class VigenereCipher extends EncryptionType {

	private String key;
	private int keyLength;

	/**
	 * Constructor to initialize the password
	 * 
	 * @param password that is used for Vigenere Encryption
	 */
	public VigenereCipher(String password) {
		this.key = password;
		this.keyLength = password.length();
	}

	/**
	 * encrypt string by Vigenere method
	 * 
	 * @param input gets input from user and encrypt it
	 * @return return the encrypted as string
	 */

	public String encrypt(String input) {
		String encrypted = "";
		for (int i = 0; i < input.length(); i++) {
			char keyChar = key.charAt(i % keyLength);

			int shift = keyChar - START_CHAR;

			encrypted += shiftChar(input.charAt(i), shift);

		}
		return encrypted;
	}

	/**
	 * decrypt string by Vigenere method with the password key
	 * 
	 * @param encrypted string
	 * @return return the decrypted version as string
	 */
	public String decrypt(String input) {
		String decrytped = "";
		for (int i = 0; i < input.length(); i++) {
			char keyChar = key.charAt(i % keyLength);

			int shift = keyChar - START_CHAR;

			decrytped += shiftChar(input.charAt(i), -shift);
		}

		return decrytped;
	}

}

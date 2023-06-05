package encryption;

/**
 * Caesar Encryption method
 * 
 * @author Sina Khodaveisi
 * @version 1.0
 * @since 1.0
 **/
public class CaesarCipher extends EncryptionType {

	private int key;

	/**
	 * Constructor to initialize the shift
	 * 
	 * @param shift shift parameter that is used for Caesar Encryption
	 */
	public CaesarCipher(int shift) {
		this.key = shift;
	}

	/**
	 * encrypt string by Caesar method
	 * 
	 * @param input gets input from user and encrypt it
	 * @return return the encrypted as string
	 */
	public String encrypt(String input) {
		String encrypted = "";
		for (int i = 0; i < input.length(); i++) {
			encrypted += shiftChar(input.charAt(i), key);
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

			decrytped += shiftChar(input.charAt(i), -key);
		}
		return decrytped;
	}

}

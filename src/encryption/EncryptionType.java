package encryption;

public abstract class EncryptionType {
	final int START_CHAR = (int) ' ';
	final int END_CHAR = (int) 'z';
	final int RANGE = (int) 'z' - ' ' + 1;

	/**
	 * encrypt string
	 * 
	 * @param input gets input from user and encrypt it
	 * @return return the encrypted as string
	 */
	public abstract String encrypt(String input);

	/**
	 * decrypt string
	 * 
	 * @param gets the encrypted text
	 * @return return the input decrypted
	 */
	public abstract String decrypt(String input);

	public char shiftChar(char charecter, int offset) {
		char ansChar = (char) ((int) charecter + offset);
		while (ansChar < START_CHAR) {
			ansChar += RANGE;
		}
		while (ansChar > END_CHAR) {
			ansChar -= RANGE;
		}
		return ansChar;

	}

	/**
	 * Print encryption methods and let user select one and initialize them
	 * 
	 * @return return the selected encryption method by user
	 */
	public static EncryptionType getMethod() {

		int methodNum = ScannerUtils
				.getInt("Encryption method\r\n" + "1 - Caesar\r\n" + "2 - Vigenere\r\n" + "Select action:", 1, 2);
		switch (methodNum) {
		case 1: {
			int shiftValue = ScannerUtils.getInt("Shift value:", 0, 2147483647);
			return new CaesarCipher(shiftValue);

		}
		case 2: {
			String password = ScannerUtils.getString("Password:");

			return new VigenereCipher(password);
		}

		}
		return null;

	}

}

package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VigenereCipher {

	@Test
	public void testEncrypt() {

		assertEquals("bXsZtVYg]e^Zke^ZkeYpZc", new encryption.VigenereCipher("test").encrypt("in a land far far away"));
		assertEquals("(OfYw?_Xc6\\]ao]", new encryption.VigenereCipher("Passwordz").encrypt("Sina Khodaveisi"));
		assertEquals("CKnZXTbaEObK]KmKj)dVWKm",
				new encryption.VigenereCipher("java").encrypt("Testing Vigenere Cipher"));
		assertEquals("qOiw qOiw dYV^eial]th",
				new encryption.VigenereCipher("very very long password").encrypt("very very secret text"));

	}

	@Test
	public void testDecrypt() {
		assertEquals("in a land far far away", new encryption.VigenereCipher("test").decrypt("bXsZtVYg]e^Zke^ZkeYpZc"));
		assertEquals("sina khodaveisi", new encryption.VigenereCipher("Passwordz").decrypt("HOfYw__Xc6\\]ao]"));
		assertEquals("testing vigenere cipher",
				new encryption.VigenereCipher("java").decrypt("cKnZXTbaeObK]KmKjIdVWKm"));
		assertEquals("very very secret text",
				new encryption.VigenereCipher("very very long password").decrypt("qOiw qOiw dYV^eial]th"));

	}
}

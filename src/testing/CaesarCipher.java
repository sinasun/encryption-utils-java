package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaesarCipher {

	@Test
	public void testEncrypt() {
		assertEquals("Tshj%zuts%f%ynrj333", new encryption.CaesarCipher(5).encrypt("Once upon a time..."));
		assertEquals("g\"'u4_!(xu/y\",\"", new encryption.CaesarCipher(20).encrypt("Sina Khodaveisi"));
		assertEquals("[2#&-w2\\s-s3333", new encryption.CaesarCipher(18).encrypt("I love Java!!!!"));
		assertEquals("t*89.3,@c&*8&7@c.5-*7@m*9-4)",
				new encryption.CaesarCipher(32).encrypt("Testing Caesar Cipher Method"));

	}

	@Test
	public void testDecrypt() {
		assertEquals("Once upon a time...", new encryption.CaesarCipher(5).decrypt("Tshj%zuts%f%ynrj333"));
		assertEquals("Sina Khodaveisi", new encryption.CaesarCipher(20).decrypt("g\"'u4_!(xu/y\",\""));
		assertEquals("I love Java!!!!", new encryption.CaesarCipher(18).decrypt("[2#&-w2\\s-s3333"));
		assertEquals("Testing Caesar Cipher Method",
				new encryption.CaesarCipher(32).decrypt("t*89.3,@c&*8&7@c.5-*7@m*9-4)"));

	}

}

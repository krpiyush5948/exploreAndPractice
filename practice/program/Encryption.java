package practice.program;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encryption {

	private final String ALGORITHM = "AES";

//	@Autowired
//	Environment env;

	String DB_ENCRYPTION_KEY = "encryptdecryptus";

	public String encrypt(String valueToEnc) throws Exception {
		final String KEY = DB_ENCRYPTION_KEY;
		if (KEY != null && KEY != "") {
			final byte[] keyValue = KEY.getBytes();
			Key key = generateKey(keyValue);
			Cipher c = Cipher.getInstance(ALGORITHM);
			c.init(Cipher.ENCRYPT_MODE, key);
			byte[] encValue = c.doFinal(valueToEnc.getBytes());
			String encryptedValue = Base64.getEncoder().encodeToString(encValue);
			return encryptedValue;
		} else {
			throw new Exception();
		}
	}

	public String decrypt(String encryptedValue) throws Exception {
		final String KEY = DB_ENCRYPTION_KEY;
		if (KEY != null && KEY != "") {
			final byte[] keyValue = KEY.getBytes();
			Key key = generateKey(keyValue);
			Cipher c = Cipher.getInstance(ALGORITHM);
			c.init(Cipher.DECRYPT_MODE, key);
			byte[] decordedValue = Base64.getDecoder().decode(encryptedValue);
			byte[] decValue = c.doFinal(decordedValue);
			String decryptedValue = new String(decValue);
			return decryptedValue;
		} else {
			throw new Exception();
		}
	}

	private Key generateKey(byte[] keyValue) throws Exception {
		Key key = new SecretKeySpec(keyValue, ALGORITHM);
		return key;
	}
	
	public static void main(String args[]) throws Exception {
		Encryption enc = new Encryption();
//		String encryptedValue = enc.encrypt("piyush");
//		String decryptedValue = enc.decrypt("SYY4iYqVr3U6yaTdpxbnMw==");
//		System.out.println(encryptedValue);
//		System.out.println(decryptedValue);
		System.out.println(enc.encrypt("piyush.kumar@triconinfotech.com"));
		
	}

}

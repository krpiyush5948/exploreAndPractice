package practice.program;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class EncodingDecoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		EncodingDecoding ed = new EncodingDecoding();
		Integer id = 123;

		String s = id + "";
//		String encodedValue = ed.encode(s);
		String encodedValue = ed.encode(s) + "/" + "int";
		System.out.println(encodedValue);
		System.out.println(ed.decode(encodedValue));
//		System.out.println(ed.decode(encodedValue));

	}

	// Encode:
	String encode(String input) {

//		String encodedValue = Base64.getEncoder().encodeToString(input.getBytes());
//		return encodedValue;
		String asB64 = null;
		try {
			asB64 = Base64.getEncoder().encodeToString(input.getBytes("utf-8"));
			System.out.println("encode method " + asB64);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return asB64;
	}

//	

	// Decode:
	public String decode(String input) {

//			byte[] decodedBytes = Base64.getDecoder().decode(input);
//			return new String(decodedBytes);
		byte[] asBytes = Base64.getDecoder().decode(input);
		System.out.println(" decode method " + asBytes);
		System.out.println();
		return new String(asBytes);

	}
}

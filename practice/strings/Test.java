package practice.strings;

public class Test {

	public static void main(String args[]) {

		// String is immutable
		String str = new String("Piyush ");
		str.concat("Kumar");
		System.out.println(str);
		String str1 = str.concat("Siddharth");
		System.out.println(str1);

		// string buffer is mutable
		StringBuffer strbfr = new StringBuffer("Piyush");
		strbfr.append("Kumar");
		System.out.println(strbfr);

		// String
		// equal method in object class is written for reference comparision
		String s1 = new String("piyush");
		String s2 = new String("piyush");
		System.out.println(s1 == s2); // reference comparision
		System.out.println(s1.equals(s2)); // content comparision in String class beacuse it overridden from object
											// class

		// String buffer
		String sb1 = new String("piyush");
		String sb2 = new String("piyush");
		System.out.println(sb1 == sb2); // reference comparision
		System.out.println(sb1.equals(sb2)); // reference comparision it is not overriden from object class

		// constructor in String
		// char
		char[] ch = { 'j', 'a', 'v', 'a' };
		String stra = new String(ch);
		System.out.println(stra);

		// byte
		byte[] b = { 97, 98, 99, 100 }; /// -128 to 127
		String strb = new String(b);
		System.out.println(strb);

		// important method in string
		// 1. charAt()

		String name = "Piyush";
		System.out.println(name.charAt(3));
		// System.out.println(name.charAt(30)); // String index out of bound

		// 2. concat()

		String strcon = "Piyush";
		// strcon = strcon.concat("Kumar");
		// strcon= strcon+"kumar"; // alternative
		strcon += "kumar";
		System.out.println(strcon);

		// 3.public boolean equals(Object s);
		// 4. public boolean equalsIgnoreCase(String s)
		String eq = "piyush";
		String eq1 = "Piyush";

		System.out.println(eq.equals(eq1));
		System.out.println(eq.equalsIgnoreCase(eq1));

		// 5.public boolean isEmpty()
		// 6. public int length()
		int[] x = { 1, 2, 3, 4 };
		String se = "";
		String sne = "piyush";
		System.out.println(se.isEmpty());
		System.out.println(sne.isEmpty());
		System.out.println(sne.length());
		System.out.println(x.length); // length variable applicable for array

		// 7. public String replace(char old,char new)
		// 8. public String substring(int begin); // return from begin index to end of
		// string
		// 9. public String substring(int begin,int end) // return from begin index to
		// end-1 index
		String sr = "abababab";
		System.out.println(sr.replace('a', 'b'));
		System.out.println(sr.substring(3));
		System.out.println(sr.substring(3, 6));

		// 10. public int indexOf(char ch) //return index of a character
		// 11. public int lastIndexOf(char ch)

		String stIn = "Piyush";
		String ls = "ababaabb";
		System.out.println(stIn.indexOf('y'));
		System.out.println(ls.lastIndexOf('b')); // return -1

		// 12.public String toLowerCase();
		// 13.public String toUpperCase();
		// 14.public String trim() // remove space from beginning and end

		String city = "   Hydrabad    ";
		System.out.println(city.toLowerCase().trim());
	}

}

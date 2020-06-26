package practice.recurssion;

public class Palindrome {

	static boolean jg; // static variable initialize automatically with default value

	public static void main(String[] args) {
		System.out.println(" args " + args);

//		String str = "abba";
		int num = 1211;
		String str = String.valueOf(num);
		int i = 0;
		int j = str.length() - 1;
		boolean palindrome = false;
		;
		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				palindrome = true;
				break;
			}
			i++;
			j--;
		}
		if (palindrome)
			System.out.println("Not a Palindrome");
		else
			System.out.println("Palindrome");
	}
}

package practice.recurssion;

//1. print number to n using recursion
public class PrintNumber {

	static int count = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumber num = new PrintNumber();
		num.printNumber(5);
	}

	void printNumber(int n) {
		count++;
		if (n == 0)
			return;
//		System.out.print(n + " ");
		System.out.print("before : "+count +" ");
		printNumber(n - 1);	
		System.out.print("after : "+count +" ");
		
	}
}

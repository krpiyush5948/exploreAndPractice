package practice.constructor;

class Parent{
	String s = "Parent Variable";
}

class Child extends Parent{
	String s = "child Variable";
	public  void m1() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
	}
}


public class Test {

	Test() {
		super();
		System.out.println("constructor");
		// Constructor call must be the first statement in a constructor
	}
		
	public static void main(String[] args) {
		
		Test t1 = new Test();
		Child c = new Child();
		c.m1();
	}
}

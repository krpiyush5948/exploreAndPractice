package practice.oops;

public class Test {
	
	public void m1() {
		System.out.println(" no arg method");
	}
	public void m1(Object i) {
		System.out.println(" int  method");
	}
	public void m1(String d) {
		System.out.println(this.hashCode());
		System.out.println(" double arg method");
	}

	public static void main(String []args) {
		
		Test t = new Test();
		t.m1("piyush");
		System.out.println(t.hashCode());
		Test t1 = new Test();
		System.out.println(t1.hashCode());
		t1.m1("dfghjk");
	}


}

package practice.strings;

final public class Itest {

	private int i;
											// we can create the immutable class explicitly
	Itest(int i){
		this.i=i;
	}
	
	public Itest modify(int i) {
		
		if(this.i==i) {
			return this;
		}
		else {
			return new Itest(i);
		}
	}
	
	public static void main(String[] args) {
		
		Itest t1 = new Itest(10);
		Itest t2 = t1.modify(100);
		Itest t3 = t1.modify(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
	}
}

package practice.collections.treeset;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("E");
		t.add("I");
		t.add("O");
		t.add("B");
		t.add("a");
		//t.add(new Integer(10));    // classcastException
	//	t.add(null);        //nullpointer exception
		System.out.println(t);
		
	}
}

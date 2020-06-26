package practice.collections.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet s = new HashSet();
		s.add("P");
		s.add("A");
		s.add("null");
		s.add(10);
		s.add("C");
		s.add("Z");
		s.add("K");
		System.out.println(s.add("A"));
		System.out.println(s);
		
		
	}
}

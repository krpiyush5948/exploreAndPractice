package practice.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet s = new LinkedHashSet();
		s.add("q");
		s.add("P");
		s.add("A");
		s.add("null");
		s.add(10);
		s.add("4");
		s.add("C");
		s.add("Z");
		s.add("K");
		System.out.println(s.add("A"));
		System.out.println(s);

	}
}

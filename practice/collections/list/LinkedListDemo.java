package practice.collections.list;

import java.util.LinkedList;

public class LinkedListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("Piyush");
		l.add(30);
		l.add(null);
		l.add("Piyush");
		l.set(0,"Kumar");
		l.add(0, "venky");
		l.removeLast();
		l.addFirst("CCCC");
		l.addLast("LLLLL");
		
		
		System.out.println(l);
		System.out.println(l.getFirst());
	}
}

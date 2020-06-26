package practice.collections.list;

import java.util.*;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		l.add("piyush");
		l.add("aarushi");
		l.add("pratyush");
		l.add("apoorva");
		System.out.println(l);
		
		java.util.ListIterator itr =  l.listIterator();
		
		while(itr.hasNext()) {
			String s = (String) itr.next();
			if(s.equals("aarushi")) {
				itr.remove();
			}else if(s.equals("pratyush")) {
				itr.add("Siddharth");
			}else if(s.equals("apoorva")) {
				itr.set("Arpita");
			}
		}
		
		System.out.println(l);
	
	}

}

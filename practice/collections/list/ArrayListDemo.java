package practice.collections.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add("A");
		l.add("B");
		l.add("A");
		l.add("P");
		
		
		System.out.println(l.toString());  //[A,10,A,null]
		l.remove(2);
		System.out.println(l);  //[A, 10, null]
		l.add(2, "M");
		System.out.println(l);  //[A, 10, M, null]
		
		//serialiazable
		
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		
		System.out.println(Collections.binarySearch(l, "Z"));
	
		
//		System.out.println(l1 instanceof Serializable);
//		System.out.println(l2 instanceof Cloneable);
//		System.out.println(l1 instanceof RandomAccess);
//		System.out.println(l2 instanceof RandomAccess);

		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		ar.remove((Integer)2);
		System.out.println(ar);
		
		float[] arr = {1.0f,2.0f,(float) 3.0};
		System.out.println(Integer.toHexString(arr.hashCode()));
		System.out.println(arr.getClass().getName());
		System.out.println(arr.toString());
		System.out.println(arr);
		for(float f:arr) {
			System.out.println(f);
		}
		
	}
}

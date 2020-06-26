package practice.collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet t = new TreeSet(new ComparatorDemo());
//		t.add(10);
//		t.add(20);
//		t.add(30);
//		t.add(40);
//		t.add(40);
//
//		System.out.println(t);
//	}

	//	@Override
//		public int compare(Object o1, Object o2) {
//			Integer I1 = (Integer) o1;
//			Integer I2 = (Integer) o2;
//		//	return I1.compareTo(I2);
//			return I1.compareTo(I2);
////			return I2.compareTo(I1);
//		//	return -I2.compareTo(I1);
////			if (I1 > I2)
////				return -1; // custom implementation for compare method
////			else if (I1 < I2)
////				return 10;
////			else
////				return 0;
//		}
//
		TreeSet t2 = new TreeSet(new ComparatorDemo());
		t2.add(new StringBuffer("F"));
		t2.add(new StringBuffer("B"));
		t2.add(new StringBuffer("H"));
//		t2.add(new StringBuffer("U"));
//		t2.add(new StringBuffer("Z"));
		System.out.println(t2);
	}
//
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		System.out.println("comparator :  "+s1+" "+s2);
		return s1.compareTo(s2);
	}

}




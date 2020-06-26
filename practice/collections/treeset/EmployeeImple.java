package practice.collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeImple {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "Piyush");
		Employee e2 = new Employee(200, "Rakesh");
		Employee e3 = new Employee(300, "Pratyush");
		Employee e4 = new Employee(400, "Komal");
		Employee e5 = new Employee(500, "Sagarika");
		Employee e6 = new Employee(10, "aga");
		Employee e7 = new Employee(160, "zagarika");

		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		t.add(e7);

		System.out.println(t);
		
		TreeSet t2 = new TreeSet(new EpmloyeeComparotor());
		t2.add(e2);
		t2.add(e1);
		
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		t2.add(e6);
		System.out.println(t2);
	}

}

class Employee implements Comparable{
	int id;
	 String name;
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int id1 = this.id;
		Employee e = (Employee)o;
		int id2 = e.id;
		if(id1<id2)
			return -1;
		else if(id>id2)
			return +1;
		else
			return 0;

}
}

 class EpmloyeeComparotor  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
	    Employee e1 =(Employee) o1;
	    Employee e2 =(Employee) o2;
	    String s1 = e1.name.toLowerCase();
	    System.out.println(s1);
	    String s2 = e2.name.toLowerCase();
	    System.out.println(s2);
	    System.out.println(s1.compareTo(s2));
	    return s1.compareTo(s2);
	}

}

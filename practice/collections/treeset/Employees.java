package practice.collections.treeset;

import java.util.TreeSet;

public class Employees  implements Comparable{

	 int id;
	 String name;
	
	
	public Employees(int id, String name) {
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


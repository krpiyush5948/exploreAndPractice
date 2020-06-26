package practice.recurssion;
/**
 * sorting of Array using recursion
 */
import java.util.ArrayList;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {

		List list = new ArrayList();
		for (int i = 2; i > 0; i--) {
			list.add(i);
		}
		list.add(0);
		list.add(5);
		list.add(2);
		// Collections.sort(list);
		System.out.println(list);
		sort(list);
		System.out.println(list);
	}

	static void sort(List arr) {

		if (arr.size() == 1)
			return;
		Integer temp = (Integer) arr.remove(arr.size() - 1);
		System.out.println("before: "+ temp + " " + arr);
		sort(arr);
		insert(arr, temp);
		System.out.println("After: "+ temp + " " + arr);
	}

	static void insert(List arr, int temp) {
		if (arr.size() == 0 || (Integer) arr.get(arr.size() - 1) <= temp) {
			arr.add(temp);
		} else {
			int t = (int) arr.remove(arr.size() - 1);
			insert(arr, temp);
			arr.add(t);
		}

	}
}

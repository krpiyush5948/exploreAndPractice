package practice.recurssion;

import java.util.ArrayList;
import java.util.List;

/**
 * revsers stack using recursion
 * 
 * @author piyush.kumar
 *
 */
public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList();
		for (int i = 0; i < 5; i++) {
			list.add(i);

		}
		System.out.println(list);
		reverseStack(list);
		System.out.println(list);

	}

	static void reverseStack(List list) {

		if (list.size() == 1)
			return;
		int temp = (int) list.remove(list.size() - 1);
		reverseStack(list);
		list.add(0,temp);

	}

}

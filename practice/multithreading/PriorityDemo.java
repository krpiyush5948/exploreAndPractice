package practice.multithreading;

class demo extends Thread{
	
}
public class PriorityDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());  // getting the current priority
		Thread.currentThread().setPriority(9);						// setting the priority 				
		System.out.println(Thread.currentThread().getPriority());
	
		demo t = new demo();
		System.out.println(t.getPriority());
	}
}

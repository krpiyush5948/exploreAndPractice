package practice.multithreading;


class ThreadChild extends Thread{
	
}

public class ThreadName {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		ThreadChild t = new ThreadChild();
		
		System.out.println(t.getName());
		Thread.currentThread().setName("test");     // setting the name of thread
		System.out.println(Thread.currentThread().getName());   // getting a name of the thread
			
	}
}

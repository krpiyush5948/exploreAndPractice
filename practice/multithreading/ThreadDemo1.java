package practice.multithreading;

class myThreads extends Thread {

	public void run() {
		System.out.println("no- arg-method");
	}
	public void run(int i) {
		System.out.println("arg-method");
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {

		myThreads t = new myThreads();
		t.start();
		

		
	}
}

package practice.multithreading;

class myJoinDemo extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child Thread");
			try {
				Thread.sleep(1000);//
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoin {

	public static void main(String[] args) {

		myJoinDemo t = new myJoinDemo();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}

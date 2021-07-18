package core;

public class Thread2 implements Runnable{

	public static void main(String[] args) {

		Thread2 obj = new Thread2();
		Thread thread = new Thread(obj);
		thread.start();
		
		System.out.println("code outside the thread");

	}

	public void run() {
		System.out.println("code inside the thread");
	}
}


//there are two ways to create thread
//2=by implementing runnable interface
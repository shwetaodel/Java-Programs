package core;

public class Thread1 extends Thread {

	public static void main(String[] args) {

		Thread1 thread=new Thread1();
		thread.start();
		
		System.out.println("code outside the thread");
	}
	
	public void run() {
		System.out.println("code inside the thread");
	}

}


//there are two ways to create thread
//1=by extending Thread class and overriding its run() method
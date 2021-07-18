package core;

public class Thread3 extends Thread{
	
	public static int amount = 0;

	public static void main(String[] args) {

		Thread3 thread = new Thread3();
		thread.start();
		
		System.out.println(amount);
		
		amount++;
		
		System.out.println(amount);

	}

	public void run() {
		amount++;
	}
}

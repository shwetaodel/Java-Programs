package core;

public class Thread4 extends Thread{
	
	public static int amount= 0;

	public static void main(String[] args) {

		Thread4 thread = new Thread4();
		
		while(thread.isAlive())
		{
			System.out.println("waiting");
		}
		
		System.out.println("main="+amount);
		amount++;
		System.out.println("main="+amount);
	}

	public void run()
	{
		amount++;
	}
}

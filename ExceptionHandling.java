package core;

public class ExceptionHandling {
	
	static void checkNum(int number) {
		if(number<20) {
			throw new ArithmeticException("Access Denied");
		}
		else {
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {

		checkNum(15);
		
	}

}

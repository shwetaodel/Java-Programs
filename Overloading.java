package questions;

public class Overloading {
	
	static int myMethod(int a,int b)
	{
		return a + b;
	}

	static double myMethod(double a,double b)
	{
		return a + b;
	}
	
	public static void main(String[] args) {
		
		int num1 = myMethod(5,5);
		double num2 = myMethod(5.5, 5.5);
		
		System.out.println("int addition"+num1);
		System.out.println("double addition"+num2);

	}

}

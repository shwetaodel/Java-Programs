package questions;

public class TypeCasting {
	
	public static void main(String args[])
	{
		
		int intNum = 15;
		
		double doubleNum = intNum;		//widening casting(done automatically)
		
		System.out.println("Integer Value="+intNum);
		System.out.println("Double Value="+doubleNum);

		double doubleNum2 = 55.99d;
		
		int intNum2 = (int) doubleNum2;		//Narrowing casting(done manually)
		
		System.out.println("\nDouble Value="+doubleNum2);
		System.out.println("Integer Value="+intNum2);

	}

}
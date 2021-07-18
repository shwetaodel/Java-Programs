package core;
import java.util.ArrayList;

public class LambdExpression1 {

	public static void main(String[] args) {

		ArrayList<Integer> num  = new ArrayList<Integer>();
		num.add(2);
		num.add(4);
		num.add(9);
		num.add(8);

		num.forEach((n) -> {System.out.println(n);});
	}

}

//a lambda expression is a short block of code which takes in parameters and returns a value
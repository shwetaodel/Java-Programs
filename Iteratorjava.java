package core;
import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorjava {

	public static void main(String[] args) {

		ArrayList<String> phones = new ArrayList<String>();
		phones.add("Apple");
		phones.add("Samsung");
		phones.add("Moto");
		phones.add("Spark");
		phones.add("Oppo");
		
		//Get the iterator
		Iterator<String> it=phones.iterator();
		
		//print the first item
		System.out.println(it.next());
		
	}

}

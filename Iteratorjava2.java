package core;
import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorjava2 {

	public static void main(String[] args) {

		ArrayList<String> phones = new ArrayList<String>();
		phones.add("Apple");
		phones.add("Samsung");
		phones.add("Moto");
		phones.add("Spark");
		phones.add("Oppo");
		
		//Get the iterator
		Iterator<String> it=phones.iterator();
		
		//Loop through a collection
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}

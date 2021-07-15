package core;
import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorjava3 {

	public static void main(String[] args) {

		ArrayList<Integer> phones = new ArrayList<Integer>();
		phones.add(5);
		phones.add(27);
		phones.add(9);
		phones.add(13);
		phones.add(1);
		
		Iterator<Integer> it=phones.iterator();
		
		while(it.hasNext()) {
			Integer i=it.next();
			if(i>10) {
				it.remove();
			}
		}
		System.out.println(phones);
		
		//Trying to remove items using a for loop or a for-each loop would not work correctly
	}

}

package core;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> phones = new ArrayList<String>();
		phones.add("Apple");
		phones.add("Samsung");
		phones.add("Moto");
		phones.add("Spark");
		phones.add("Oppo");
		
		System.out.println(phones);
		
		//Access an item
		System.out.println(phones.get(1));
		
		//Change an item
		phones.set(3, "Vivo");
		System.out.println(phones);

		//Remove an item
		phones.remove(2);
		System.out.println(phones);
		
		//get Size of array
		System.out.println(phones.size());
		
		//Loop through an ArrayList
		for(int i=0;i<phones.size();i++)
		{
			System.out.println(phones.get(i));
		}

		//foe-each loop
		for(String i:phones)
		{
			System.out.println(i);
		}
		
		//Sort an ArrayList (import java.util.Collections;)
		Collections.sort(phones);
		for(String i:phones)
		{
			System.out.println(i);
		}
		
		//clear ArrayList
		phones.clear();
		System.out.println(phones);
	}

}

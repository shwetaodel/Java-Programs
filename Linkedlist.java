package core;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

		LinkedList<String> phones = new LinkedList<String>();
		phones.add("Apple");
		phones.add("Samsung");
		phones.add("Moto");
		phones.add("Spark");
		phones.add("Oppo");
		
		System.out.println(phones);
		
		//Check If an Item Exists
		System.out.println(phones.contains("Moto"));

		//Adds an item to the beginning of the list
		phones.addFirst("Vivo");
		System.out.println(phones);

		//Add an item to the end of the list
		phones.addLast("Mi");
		System.out.println(phones);

		//Remove an item from the beginning of the list
		
		System.out.println(phones.removeFirst());
		
		//Remove an item from the end of the list
		
		System.out.println(phones.removeLast());
		
		//Get the item at the beginning of the list
		
		System.out.println(phones.getFirst());
		
		//Get the item at the end of the list
		
		System.out.println(phones.getLast());
		
		//Loop through an LinkedList
		for(int i=0;i<phones.size();i++)
		{
			System.out.println(phones.get(i));
		}
	}

}

package core;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {

		HashSet<String> phones=new HashSet<String>();
		phones.add("Apple");
		phones.add("Samsung");
		phones.add("Moto");
		phones.add("Spark");
		phones.add("Oppo");
		
		System.out.println(phones);
		
		//Check If an Item Exists
		System.out.println(phones.contains("Moto"));
		
		//Remove an Item
		phones.remove("Moto");
		System.out.println(phones);

		//HashSet Size
		System.out.println(phones.size());
		
		//HashSet with a for-each loop
		for(String i:phones)
		{
			System.out.println(i);
		}
		
		phones.clear();
		System.out.println(phones);

	}

}

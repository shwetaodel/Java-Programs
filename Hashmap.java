package core;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String, String> city = new HashMap<String, String>();
		// Add keys and values (State, City)
		city.put("Maharashtra", "Pune");
		city.put("Telangana","Hydrabad");
		city.put("Tamilnadu","Chennai");
		city.put("Panjab","Amritsar");
		city.put("England", "London");
		city.put("Bangal", "Kolkata");
		
		System.out.println(city);

		//Access an Item
		System.out.println(city.get("Panjab"));
		
		//Remove an Item
		city.remove("England");
		System.out.println(city);

		//HashMap Size
		System.out.println(city.size());
		
		//Loop Through a HashMap
		//Get Keys
		for(String i:city.keySet())
		{
			System.out.println(i);
		}
		
		//Get Values
		for(String i:city.values())
		{
			System.out.println(i);
		}

		//Get Keys and Values
		for(String i:city.keySet())
		{
			System.out.println("Key="+i+","+"Values="+city.get(i));
		}
	}

}

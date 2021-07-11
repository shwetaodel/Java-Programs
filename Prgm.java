package questions;

public class Prgm {
	
	public static void main(String args[])
	{
		
		String name = "Shweta Raju Odel";
		System.out.println("length of a string=" +name.length());
		
		System.out.println("Convert to lowercase=" +name.toLowerCase());
		System.out.println("Convert to lowercase=" +name.toUpperCase());
		
		System.out.println("Check position=" +name.indexOf("Raju")); //Count starts from zero
		
		String txt = "Hello";
		System.out.println("Concat Two Strings= " +txt + "," + name);
		
		System.out.println("Concat Two Strings= " +(txt).concat(name));
		
		//System.out.println("core "java" programs");		=this will give error.
		//to avoid this problem use Backslash escape character
		
		System.out.println("core \"java\" programs");	
		System.out.println("core \'java\' programs");
		System.out.println("core \\java\\ programs");		


	}

}

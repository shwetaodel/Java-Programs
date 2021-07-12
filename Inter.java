package core;

interface Animal
{
	String name="Doggggg";
	public void sound();
}

interface Dog
{
	public void sound1();
}

class Sounds implements Animal,Dog
{
	public void sound()
	{
		System.out.println("hello");
	}
	
	public void sound1()
	{
		System.out.println("bhow bhow");
	}
}

public class Inter {
	
	public static void main(String args[])
	{
		
		Sounds so=new Sounds();
		so.sound();
		System.out.println(so.name);
		so.sound1();
	}

}

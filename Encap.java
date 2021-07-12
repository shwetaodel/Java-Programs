package core;

public class Encap {
	
	private String name;
	
	public void setName(String myName)
	{
		this.name=myName;
	}
	public String getName()
	{
		return name;
	}

	public static void main(String args[])
	{
		Encap encap=new Encap();
		encap.name="Shweta";
		System.out.println(encap.name);
		
	}
}

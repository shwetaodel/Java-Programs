package questions;

public class Constructor2 {
	
	String name;
	int year;
	
	public Constructor2(String nm,int yr)
	{
		name=nm;
		year=yr;
	}

	public static void main(String[] args) {

		Constructor2 cc=new Constructor2("Shweta",1999);
		System.out.println("Name="+cc.name+"\nYear="+cc.year);
		
	}

}

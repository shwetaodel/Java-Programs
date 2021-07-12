package questions;

public class Objects {
	
	String name = "Shweta";
	
	final int i=5;

	public static void main(String[] args) {

		Objects obj = new Objects();
		
		System.out.println(obj.name);
		
		obj.name="SHWETA";
		
		System.out.println(obj.name);
		
		//obj.i=6;		this will generate error
	
	}

}

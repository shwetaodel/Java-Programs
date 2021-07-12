package core;

public class Constructor3 {
	
	String names;
	int ages;
	
	public Constructor3() {
		
		
	}
	
	private void ages(int age) {
		ages=age;
		
		System.out.println("age="+ages);
	}	
	private void names(String name) {
		names=name;
		System.out.println("name="+names);
	}
	
	
	
	public static void main(String args[]) {
		
		Constructor3 cr= new Constructor3();
		
		cr.ages(1);
		cr.names("shweta");
	}




}


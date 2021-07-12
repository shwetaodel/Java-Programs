package questions;

abstract class Abstract {		//abstract class
	
	public String name="shweta";
	public int age = 22;
	public abstract void details();
}
	
	class Student extends Abstract{		//subclass inherits main class
		
		int year=1999;
		public void details() {
			System.out.println("lets learn java");
		}

	public static void main(String[] args) {
		
		Student std=new Student();		//we can't create object of abstract class
		
		System.out.println("Name="+std.name);
		System.out.println("Age="+std.age);
		System.out.println("Year"+std.year);
		std.details();

	}
}


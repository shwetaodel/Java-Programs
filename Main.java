package core;
class Person {
	   private String name;
	    private int a;
	    
	    public int getInt() {
	    	return a;
	    	
	    }
	    public void setInt(int aa) {
	    	this.a=aa;
	    }

	   // Getter
	   public String getName() {
	     return name;
	   }

	   // Setter
	   public void setName(String newName) {
	     this.name = newName;
	   }
	}
public class Main {
	  public static void main(String[] args) {
	    Person myObj = new Person();
	    myObj.setName("John");
	    System.out.println(myObj.getName());
	    myObj.setInt(11);
	    System.out.println(myObj.getInt());

	  }
	}

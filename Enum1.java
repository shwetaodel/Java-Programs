package core;

enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}

	public class Enum1 {
	  public static void main(String[] args) {
		  
		  Level myVar1 = Level.LOW; 
		    System.out.println(myVar1);
		    
	    Level myVar = Level.MEDIUM;

	    switch(myVar) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }
	    
	    for (Level myVar2 : Level.values()) {
	    	  System.out.println(myVar2);
	    	}
	  }
	}
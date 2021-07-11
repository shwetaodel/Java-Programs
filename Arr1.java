package questions;

public class Arr1 {

	public static void main(String[] args) {

		String[] lang= {"java","android","go","python"};

		System.out.println("display array");
		
		for(int i=0;i<lang.length;i++)
		{
		System.out.println(lang[i]);
		}
		
		System.out.println("update string");
		
		lang[1]="Android";
		for(int i=0;i<lang.length;i++)
		{
		System.out.println(lang[i]);
		}

		System.out.println("length of the array");
		
		System.out.println(lang.length);

		System.out.println("for-each loop");
		
		for(String i:lang)
		{
			System.out.println(i);
		}
	}

}

package core;

import java.io.*;
import java.util.Arrays;

public class AnagramPrgm {

	public static void main(String[] args) throws IOException {

		boolean status=true;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter First String");
		String name1 = br.readLine();
		System.out.println("Enter Second String");
		String name2 = br.readLine();

		if(name1.length()!=name2.length())
		{		
			status=false;			
		}else {
			char[] arr1=name1.toLowerCase().toCharArray();
			char[] arr2=name2.toLowerCase().toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			status=Arrays.equals(arr1, arr2);
		}
		
		if(status) {
			System.out.println("String is an anagram");
		}else {
			System.out.println("Not an anagram");
		}
	}

}

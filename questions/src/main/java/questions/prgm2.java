package questions;

import java.io.*;

public class prgm2 {
	
	public static void main(String args[])throws IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter two values");
	
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	
	int c=a+b;
	
	System.out.println("Addition of numbers="+c);
	
	}
}

package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arr2 {
	
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			
			System.out.println("enter number of persons");
			int ages=Integer.parseInt(br.readLine());
			
			int m[]=new int[ages];

			System.out.println("enter age of each member");

			for(int i=0;i<ages;i++)
			{
				m[i]=Integer.parseInt(br.readLine());

			}
			for(int i=0;i<m.length;i++)
			{
				
				System.out.println(m[i]);

			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}

}

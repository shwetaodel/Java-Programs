package core;

import java.util.Arrays;

public class MergeArray1 {

	public static void main(String[] args) {

		int[] first= {11,4,2,54,23};
		int[] second= {11,4,2,54,23};
		
		//add the length of first array into second array
		
		int length = first.length+second.length;
		
		int[] merged = new int[length];	//result array
	
		int pos=0;
		for(int i:first)
		{
			merged[pos]=i;
			pos++;
		}
		for(int i:second)
		{
			merged[pos]=i;
			pos++;
		}
		
		System.out.println(Arrays.toString(merged));
	}

}

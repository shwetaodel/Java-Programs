package core;
import java.util.*;

import java.util.Arrays;

public class MergedArray2 {

	public static void main(String[] args) {

		String str1[]= {"S","H","W"};
		String str2[]={"E","T","A"};
		
		List list=new ArrayList(Arrays.asList(str1));
		
		list.addAll(Arrays.asList(str2));
		Object[] str3=list.toArray();
		
		System.out.println(Arrays.toString(str3));
		
	}

}

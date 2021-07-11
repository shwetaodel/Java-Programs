package questions;

public class Arr2 {

	public static void main(String[] args) {

		System.out.println("Multidimensional array");
		
		int[][] num= {{1,2,3,4},{5,6,7,8}};
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.println(num[i][j]);
			}
		}
		
		int a=num[1][2];		//3rd element in the 2nd array
		
		System.out.println(a);

	}
}

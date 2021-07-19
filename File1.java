package core;
import java.io.File;

public class File1 {

	public static void main(String[] args) {

		File obj = new File("first.txt");
		
		if(obj.exists())
		{
			System.out.println("file name="+obj.getName());
			System.out.println("absolute path="+obj.getAbsolutePath());
			System.out.println("wirteable="+obj.canWrite());
			System.out.println("readable="+obj.canRead());
			System.out.println("file size in byte="+obj.length());
		}else {
			System.out.println("file not exist");
		}
	}

}

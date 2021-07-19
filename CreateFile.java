package core;
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		try {
			File obj = new File("first.txt");
			if(obj.createNewFile())
			{
				System.out.println("File created="+obj.getName());
			}
			else {
				System.out.println("file already exists");
			}
		}catch(IOException e){
			System.out.println("error");
			e.printStackTrace();
		}
	}

}

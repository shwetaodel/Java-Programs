package core;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {

		try {
			FileWriter mywriter = new FileWriter("first.txt");
			
			mywriter.write("hello everyone");
			mywriter.close();
			
			System.out.println("successfully wrote");
		}catch(IOException e)
		{
			System.out.println("error");
			e.printStackTrace();
		}
	}

}

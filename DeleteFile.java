package core;
import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {

		File obj = new File("first.txt");
		
		if(obj.delete()) {
			System.out.println("delete the file="+obj.getName());
		}else {
			System.out.println("failed to delete the file");
		}
		
	}

}

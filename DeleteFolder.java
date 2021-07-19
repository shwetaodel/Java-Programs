package core;
import java.io.File;

public class DeleteFolder {

	public static void main(String[] args) {

		File obj = new File("C:\\Users\\odel\\Desktop");
		
		if(obj.delete()) {
			System.out.println("folder deleted="+obj.getName());
		}else {
			System.out.println("failed to delete the folder");
		}
	}

}

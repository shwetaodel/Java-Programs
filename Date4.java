package core;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date4 {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.now();
		System.out.println("Before formatting=" +date);
		
		DateTimeFormatter myFormatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = date.format(myFormatted);
		System.out.println("After Formatting=" +formattedDate);
		
	}

}

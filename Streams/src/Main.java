import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		{
//			File file = new File("src/studyEasy.txt");
//			file.createNewFile();
//			System.out.println("File created");
			
			File directory = new File("studyeasy\\author");
			directory.mkdirs();
			System.out.println("directory created");
			File file = new File("studyeasy\\author\\test.txt");
			file.createNewFile();
			System.out.println("File created");
		}
	}

}

//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//import java.io.FileNotFoundException;
import java.io.File;

public class Main {

	public static void lire() throws IOException {
		// FileWriter myWriter = new FileWriter("D:FileHandlingNewFilef1.txt");
		File myObj = new File("a_example.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		lire();
	}

}

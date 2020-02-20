//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//import java.io.FileNotFoundException;
import java.io.File;

public class Main {

	private static Book[] livres;
	private static Library[] biblios;
	private static int B, L, D;
	
	public static void lire() throws IOException {
		// FileWriter myWriter = new FileWriter("D:FileHandlingNewFilef1.txt");
		File myObj = new File("a_example.txt");
		Scanner myReader = new Scanner(myObj);
		//int i = 1; 
		String data = myReader.nextLine(); //first line
		String[] words = data.split("\\s+");
		B = Integer.parseInt(words[0].replaceAll("[^\\w]", ""));
		L = Integer.parseInt(words[1].replaceAll("[^\\w]", ""));
		D = Integer.parseInt(words[2].replaceAll("[^\\w]", ""));
		
		livres = new Book[B];
		data = myReader.nextLine(); //second line
		words = data.split("\\s+");
		for (int i = 0; i < B; i++) {
			livres[i] = new Book(Integer.parseInt(words[i].replaceAll("[^\\w]", "")), i);
		    
		}
		
		biblios = new Library[L];
		for (int i = 0; i < L; i++) {
			data = myReader.nextLine();
			words = data.split("\\s+");
			biblios[i] = new Library(Integer.parseInt(words[0].replaceAll("[^\\w]", "")),
					Integer.parseInt(words[2].replaceAll("[^\\w]", "")),
					Integer.parseInt(words[1].replaceAll("[^\\w]", "")));
			
			data = myReader.nextLine();
			words = data.split("\\s+");
			for (int j = 0; j < biblios[i].getNbBooks(); j++) {
				biblios[i].ajouter(livres[Integer.parseInt(words[j].replaceAll("[^\\w]", ""))]);
			}
		}
		myReader.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		lire();
	}

}

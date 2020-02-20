//import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;

public class Main {

	private static Book[] livres;
	private static Library[] biblios;
	private static int B, L, D;
	private static int scannsPerBook[];
	
	public static void lire(String nom) throws IOException {
		// FileWriter myWriter = new FileWriter("D:FileHandlingNewFilef1.txt");
		File myObj = new File(nom);
		Scanner myReader = new Scanner(myObj);
		int k; 
		String data = myReader.nextLine(); //first line
		String[] words = data.split("\\s+");
		B = Integer.parseInt(words[0].replaceAll("[^\\w]", ""));
		L = Integer.parseInt(words[1].replaceAll("[^\\w]", ""));
		D = Integer.parseInt(words[2].replaceAll("[^\\w]", ""));
		
		livres = new Book[B];
		scannsPerBook = new int[B];
		for (int i = 0; i < B; i++) {
			scannsPerBook[i] = 0;
		}
		data = myReader.nextLine(); //second line
		words = data.split("\\s+");
		for (int i = 0; i < B; i++) {
			livres[i] = new Book(Integer.parseInt(words[i].replaceAll("[^\\w]", "")), i);
		    
		}
		
		biblios = new Library[L];
		for (int i = 0; i < L; i++) {
			data = myReader.nextLine();
			words = data.split("\\s+");
			biblios[i] = new Library(i, Integer.parseInt(words[0].replaceAll("[^\\w]", "")),
					Integer.parseInt(words[2].replaceAll("[^\\w]", "")),
					Integer.parseInt(words[1].replaceAll("[^\\w]", "")));
			
			data = myReader.nextLine();
			words = data.split("\\s+");
			
			for (int j = 0; j < biblios[i].getNbBooks(); j++) {
				k = Integer.parseInt(words[j].replaceAll("[^\\w]", ""));
				biblios[i].ajouter(livres[k]);
				livres[k].getLibraries().add(i);
			}
		}
		myReader.close();
	}
	
	public void sauvegarde(String nom) throws IOException {
		FileWriter myWriter = new FileWriter(nom);
		
		 
		 
		boolean sameScore = true;
		boolean sameBooksPerDay = true;
		int i = 0, score = livres[0].getScore(), bpd;
		while (i < B) {
			if (livres[i].getScore() != score){
				sameScore = false;
				break;
			}
			i++;
		}
	
		i=0;
		bpd = biblios[0].getNbBookPerDay();
		while (i < L) {
			if (biblios[i].getNbBookPerDay() != bpd){
				sameBooksPerDay = false;
				break;
			}
			i++;
		}
		
		if (sameBooksPerDay && sameScore) {
			Arrays.sort(biblios);
			
			D -= biblios[0].getNbDays();
			//if (biblios[0].daysScanning() > D)
				
		}
		// Closing is necessary to retrieve the resources allocated
		myWriter.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		lire("b_read_on.txt");
		
	
	
	}
	

}


import java.util.HashSet;

public class Library implements Comparable<Library>{
	private int nbBooks, nbBookPerDay, ID;
	private HashSet<Book> setBooks = new HashSet<Book>();
	private int nbDays;
	public HashSet<Book> getSetBooks() {
		return setBooks;
	}
	
	public int score() {
		int somme = 0;
		for (Book b : setBooks) {
			somme += b.getScore();
		}
		return somme;
	}
	
	public float daysScanning() {
		return nbBooks / nbBookPerDay;
	}
	
	public Library(int ID, int nbBooks, int nbBookPerDay, int nbDays) {
		super();
		this.nbBooks = nbBooks;
		this.nbBookPerDay = nbBookPerDay;
		this.nbDays = nbDays;
		this.ID = ID;
	}

	public void ajouter(Book b) {
		setBooks.add(b);
	}

	public void setSetBooks(HashSet<Book> setBooks) {
		this.setBooks = setBooks;
	}

	public int getNbDays() {
		return nbDays;
	}

	public void setNbDays(int nbDays) {
		this.nbDays = nbDays;
	}

	public int getNbBookPerDay() {
		return nbBookPerDay;
	}

	public void setNbBookPerDay(int nbBookPerDay) {
		this.nbBookPerDay = nbBookPerDay;
	}

	public int getNbBooks() {
		return nbBooks;
	}

	public void setNbBooks(int nbBooks) {
		this.nbBooks = nbBooks;
	}

	@Override
	public int compareTo(Library o) {
		// TODO Auto-generated method stub
		return ((Integer) this.nbDays).compareTo((Integer) o.getNbDays());
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}

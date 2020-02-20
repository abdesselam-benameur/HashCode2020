
import java.util.HashSet;

public class Library {
	private int nbBooks, nbBookPerDay;
	private HashSet<Book> setBooks = new HashSet<Book>();
	private int nbDays;
	public HashSet<Book> getSetBooks() {
		return setBooks;
	}
	
	public Library(int nbBooks, int nbBookPerDay, int nbDays) {
		super();
		this.nbBooks = nbBooks;
		this.nbBookPerDay = nbBookPerDay;
		this.nbDays = nbDays;
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
	
	
}

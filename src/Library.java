
import java.util.HashSet;

public class Library {
	private int nbBookPerDay;
	private HashSet<Book> setBooks ;
	private int nbDays;
	public HashSet<Book> getSetBooks() {
		return setBooks;
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

	public Library(int nbBookPerDay) {
		super();
		this.nbBookPerDay = nbBookPerDay;
		this.setBooks = new HashSet<>();
	}

	public int getNbBookPerDay() {
		return nbBookPerDay;
	}

	public void setNbBookPerDay(int nbBookPerDay) {
		this.nbBookPerDay = nbBookPerDay;
	}
	
	
}

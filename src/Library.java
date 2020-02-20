import java.util.HashSet;

public class Library {
	private int nbBookPerDay;
	private HashSet<Book> setBooks ;

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


public class Book {
	private int Score;
	private int ID;

	public Book(int score, int iD) {
		super();
		Score = score;
		ID = iD;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}
}

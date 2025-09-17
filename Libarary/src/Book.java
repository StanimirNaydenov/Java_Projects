
public class Book extends Publication {
	public String authorName;
	
	public Book(String title, int year, String authorName) {
		super(title, year);
		this.authorName = authorName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", year=" + year +",authorName=" + authorName + "]";
	}

	
	

}


public abstract class Publication {
	protected String title;
	protected int year;
	
	public Publication(String title, int year) {
		this.title = title;
		this.year = year; 
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

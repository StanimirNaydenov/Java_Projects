
public class Rejisior extends Films {

	public String name;
	
	public Rejisior(String title, int year, String name) {
		super(title, year);
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie: " + name + ", " + title + ", " + year + "";
	}

}

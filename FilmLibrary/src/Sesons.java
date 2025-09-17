
public class Sesons extends Films {
	
	public int count;

	public Sesons(String title, int year, int count) {
		super(title, year);
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Serial:  " + count + ", " + title + ", " + year + "";
	}

}

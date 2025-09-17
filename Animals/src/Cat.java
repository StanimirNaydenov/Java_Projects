
public class Cat extends Animal {
		
	protected String Sname;
	protected int year; 
	
	public Cat(String kind, String type, String wereIs, String Sname, int year) {
		super(kind, type, wereIs);
		
		this.Sname = Sname;
		this.year = year;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Cat [Sname=" + Sname + ", year=" + year + ", getSname()=" + getSname() + ", getYear()=" + getYear()
				+ "]";
	}

	
}

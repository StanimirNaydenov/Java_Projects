
public abstract class Club {
	protected String name;
	protected int year;
	protected String city;
	
	public Club(String name, int year, String city) {
		this.name = name;
		this.year = year;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

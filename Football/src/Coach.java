
public class Coach extends Club {
	
	public String cName;
	public int yearExp;

	public Coach(String name, int year, String city, String cName, int yearExp) {
		super(name, year, city);
		this.cName = cName;
		this.yearExp = yearExp;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getYearExp() {
		return yearExp;
	}

	public void setYearExp(int yearExp) {
		this.yearExp = yearExp;
	}

	@Override
	public String toString() {
		return "Coach [cName=" + cName + ", yearExp=" + yearExp + ", name=" + name + ", year=" + year + ", city=" + city
				+ "]";
	}
	
	

}

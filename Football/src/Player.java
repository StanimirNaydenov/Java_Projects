
public class Player extends Club  {
	
	public String pName;
	public double selary;
	
	public Player(String name, int year, String city,String pName,double selary) {
		super(name, year, city);
		this.pName = pName;
		this.selary = selary;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getSelary() {
		return selary;
	}

	public void setSelary(double selary) {
		this.selary = selary;
	}

	@Override
	public String toString() {
		return "Player [pName=" + pName + ", selary=" + selary + ", name=" + name + ", year=" + year + ", city=" + city
				+ "]";
	}
	

}


public class Runurs extends Competitive {

	public double time;
	
	public Runurs(String name, int year, double time) {
		super(name, year);
		
		this.time = time;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Runurs [time=" + time + ", name=" + name + ", year=" + year + "]";
	}

}

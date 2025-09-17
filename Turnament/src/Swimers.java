
public class Swimers extends Competitive {
	
	public double avrgSpeed;

	public Swimers(String name, int year, double avrgSpeed) {
		super(name, year);
		this.avrgSpeed = avrgSpeed;
	}

	public double getAvrgSpeed() {
		return avrgSpeed;
	}

	public void setAvrgSpeed(double avrgSpeed) {
		this.avrgSpeed = avrgSpeed;
	}

	@Override
	public String toString() {
		return "Swimers [avrgSpeed=" + avrgSpeed + ", name=" + name + ", year=" + year + "]";
	}

}


public class Cars extends AutoPark {
	
	public int dors;

	public Cars(String model, String yearOfMade, int dors) {
		super(model, yearOfMade);
		this.dors = dors;
	}

	public int getDors() {
		return dors;
	}

	public void setDors(int dors) {
		this.dors = dors;
	}

	@Override
	public String toString() {
		return "Cars [dors=" + dors + ", model=" + model + ", yearOfMade=" + yearOfMade + "]";
	}

}

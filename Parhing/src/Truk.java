
public class Truk extends AutoPark {
	
	public int maxCapacitet;

	public Truk(String model, String yearOfMade, int maxCapacitet) {
		super(model, yearOfMade);
		this.maxCapacitet = maxCapacitet;
	}

	public int getMaxCapacitet() {
		return maxCapacitet;
	}

	public void setMaxCapacitet(int maxCapacitet) {
		this.maxCapacitet = maxCapacitet;
	}

	@Override
	public String toString() {
		return "Truk [maxCapacitet=" + maxCapacitet + ", model=" + model + ", yearOfMade=" + yearOfMade + "]";
	}

}

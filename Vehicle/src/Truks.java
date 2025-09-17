
public class Truks extends Vehicle {
	
	protected String curse;
	protected int distance;

	public Truks(String type, String brand, String model, String curse, int distance) {
		super(type, brand, model);
		
		this.curse = curse;
		this.distance = distance;
	}

	public String getCurse() {
		return curse;
	}

	public void setCurse(String curse) {
		this.curse = curse;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Truks [curse=" + curse + ", distance=" + distance + ", type=" + type + ", brand=" + brand + ", model="
				+ model + "]";
	}
	
	
	

}

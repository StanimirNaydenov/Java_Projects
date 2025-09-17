
public class SmartPhone extends Shop {
	
	public double capacityOfBattery;
	public String color;

	public SmartPhone(String category, String type, double price, double capacityOfBattery, String color) {
		super(category, type, price);
		this.capacityOfBattery = capacityOfBattery;
		this.color = color;
	}

	public double getCapacityOfBattery() {
		return capacityOfBattery;
	}

	public void setCapacityOfBattery(double capacityOfBattery) {
		this.capacityOfBattery = capacityOfBattery;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "SmartPhone [capacityOfBattery=" + capacityOfBattery + ", color=" + color + ", category=" + category
				+ ", type=" + type + ", price=" + price + "]";
	}

}

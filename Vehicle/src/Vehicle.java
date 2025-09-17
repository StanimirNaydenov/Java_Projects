
public abstract class Vehicle {
	protected String type;
	protected String brand;
	protected String model;
	
	public Vehicle(String type, String brand, String model) {
		this.type = type;
		this.brand = brand;
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
}

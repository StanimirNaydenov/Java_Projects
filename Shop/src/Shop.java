
public abstract class Shop {
	protected String category;
	protected String type;
	protected double price;
	
	public Shop(String category,String type, double price) {
		this.category = category;
		this.type = type;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

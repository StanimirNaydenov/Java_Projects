
public class Deinost {
	private String kategory;
	private String type;
	private String date;
	private double price;
	
	public Deinost(String kategory, String type, String date, double price) {
		this.kategory = kategory;
		this.type = type;
		this.date = date;
		this.price = price;
	}


	public String getKategory() {
		return kategory;
	}



	public void setKategory(String kategory) {
		this.kategory = kategory;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Deinost [kategory=" + kategory + ", type=" + type + ", date=" + date + ", price=" + price + "]";
	}

}


public class Pc extends Shop {
	
	public String madeIn;
	public int serialNumber;
	

	public Pc(String category, String type, double price, String madeIn, int serialNumber) {
		super(category, type, price);
		
		this.madeIn = madeIn;
		this.serialNumber = serialNumber;
		
	}


	public String getMadeIn() {
		return madeIn;
	}


	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}


	public int getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}


	@Override
	public String toString() {
		return "Pc [madeIn=" + madeIn + ", serialNumber=" + serialNumber + ", category=" + category + ", type=" + type
				+ ", price=" + price + "]";
	}

}

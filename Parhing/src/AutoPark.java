
public abstract class AutoPark {
	
	protected String model;
	protected String yearOfMade;
	
	public AutoPark(String model, String yearOfMade) {
		this.model = model;
		this.yearOfMade = yearOfMade;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYearOfMade() {
		return yearOfMade;
	}

	public void setYearOfMade(String yearOfMade) {
		this.yearOfMade = yearOfMade;
	}

}

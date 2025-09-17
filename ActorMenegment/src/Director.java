
public class Director extends Cinema {
	
	public double budget;

	public Director(String name, String gender, String egn, double budget) {
		super(name, gender, egn);
		this.budget = budget;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Director [budget=" + budget + ", name=" + name + ", gender=" + gender + ", egn=" + egn + "]";
	}

}

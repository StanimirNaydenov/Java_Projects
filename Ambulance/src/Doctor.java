
public class Doctor extends People {
		public String specialnost;
		public int years;

	public Doctor(String name, String egn, int age, String specialnost, int years) {
		super(name, egn, age);
		this.specialnost = specialnost;
		this.years = years;
	}

	public String getSpecialnost() {
		return specialnost;
	}

	public void setSpecialnost(String specialnost) {
		this.specialnost = specialnost;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "Doctor [specialnost=" + specialnost + ", years=" + years + ", name=" + name + ", egn=" + egn + ", age="
				+ age + "]";
	}

}

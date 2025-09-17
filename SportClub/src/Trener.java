
public class Trener extends Person {
	public int yearEx;
	public double money;

	public Trener(String name, int age, String egn, int yearEx, double money) {
		super(name, age, egn);
		this.yearEx = yearEx;
		this.money = money;
	}

	public int getYearEx() {
		return yearEx;
	}

	public void setYearEx(int yearEx) {
		this.yearEx = yearEx;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Trener [yearEx=" + yearEx + ", money=" + money + ", name=" + name + ", age=" + age + ", egn=" + egn + "]";
	}
	

}


public class Pacient extends People {
	public String diagnose;
	public int days;

	public Pacient(String name, String egn, int age, String diagnose, int days) {
		super(name, egn, age);
		this.diagnose = diagnose;
		this.days = days;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Doctor [diagnose=" + diagnose + ", days=" + days + ", name=" + name + ", egn=" + egn + ", age=" + age
				+ "]";
	}

}

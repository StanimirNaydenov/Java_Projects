
public class Atletick extends Person {
	public String disciplin;
	public int personalRecord;

	public Atletick(String name, int age, String egn, String disciplin, int personalRecord) {
		super(name, age, egn);
		this.disciplin = disciplin;
		this.personalRecord = personalRecord;
	}

	public String getDisciplin() {
		return disciplin;
	}

	public void setDisciplin(String disciplin) {
		this.disciplin = disciplin;
	}

	public int getPersonalRecord() {
		return personalRecord;
	}

	public void setPersonalRecord(int personalRecord) {
		this.personalRecord = personalRecord;
	}

	@Override
	public String toString() {
		return "Atletick [disciplin=" + disciplin + ", personalRecord=" + personalRecord + ", name=" + name + ", age="
				+ age + ", egn=" + egn + "]";
	}

}

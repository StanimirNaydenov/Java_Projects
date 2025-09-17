
public class Student extends People {
	public int avgGrade;
	
	public Student(String name, String gender, String egn, int avgGrade) {
		super(name,egn,gender);
		this.avgGrade = avgGrade;
	}

	public int getAvgGrade() {
		return avgGrade;
	}

	public void setAvgGrade(int avgGrade) {
		this.avgGrade = avgGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" +name+ ",egn=" +egn+ ",gender" +gender+ ",avgGrade=" + avgGrade + "]";
	}

}

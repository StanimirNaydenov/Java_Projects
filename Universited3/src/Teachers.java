
public class Teachers extends People {
	public int salary;
	
	public Teachers(String name, String gender, String egn, int salary) {
		super(name,egn,gender);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teachers [name=" +name+ ",egn=" +egn+ ",gender" +gender+ ",salary=" + salary + "]";
	}

}

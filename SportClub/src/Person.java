
public abstract class Person {
	protected String name;
	protected int age;
	protected String egn;
	
	public Person(String name, int age, String egn) {
		this.name = name;
		this.age = age;
		this.egn= egn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEgn() {
		return egn;
	}

	public void setEgn(String egn) {
		this.egn = egn;
	}

}

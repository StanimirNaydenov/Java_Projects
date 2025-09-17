
public abstract class People {
	protected String name;
	protected String egn;
	protected int age;
	
	public People(String name, String egn, int age) {
		this.name = name;
		this.egn = egn;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEgn() {
		return egn;
	}

	public void setEgn(String egn) {
		this.egn = egn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

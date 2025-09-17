
public class Dog extends Animal {
	
	protected String name;
	protected int age;

	public Dog(String kind, String type, String wereIs, String name, int age) {
		super(kind, type, wereIs);
		
		this.age = age;
		this.name = name;
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

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	

}

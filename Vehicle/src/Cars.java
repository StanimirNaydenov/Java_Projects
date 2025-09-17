
public class Cars extends Vehicle {
	
	protected int hp;
	
	public Cars(String type, String brand, String model, int hp) {
		super(type, brand, model);
		
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Cars [hp=" + hp + ", type=" + type + ", brand=" + brand + ", model=" + model + "]";
	}

	

}

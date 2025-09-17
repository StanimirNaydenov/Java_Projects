
public abstract class Cinema {
	protected String name;
	protected String gender;
	protected String egn;
	
	public Cinema(String name, String gender, String egn) {
		this.name = name;
		this.gender = gender;
		this.egn = egn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEgn() {
		return egn;
	}

	public void setEgn(String egn) {
		this.egn = egn;
	}
	

}

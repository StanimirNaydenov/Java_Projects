
public abstract class Animal {
	private String kind;
	private String type;
	private String wereIs;
	
	public Animal(String kind, String type, String wereIs) {
		this.kind = kind;
		this.type = type;
		this.wereIs = wereIs;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWereIs() {
		return wereIs;
	}

	public void setWereIs(String wereIs) {
		this.wereIs = wereIs;
	}

}

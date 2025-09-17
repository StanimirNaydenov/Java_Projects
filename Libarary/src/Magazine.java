
public class Magazine extends Publication {
	
	public boolean publishOrNo;
	
	public Magazine(String title, int year, boolean publishOrNo) {
		super(title, year);
		this.publishOrNo = publishOrNo;
	}

	public boolean isPublishOrNo() {
		return publishOrNo;
	}

	public void setPublishOrNo(boolean publishOrNo) {
		this.publishOrNo = publishOrNo;
	}

	@Override
	public String toString() {
		return "Magazine [title=" + title + ", year=" + year +",publishOrNo=" + publishOrNo + "]";
	}
	
	

}

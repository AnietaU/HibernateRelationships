package ManyToMany;

public class Ipad {
	
	private int ipadId;
	private String ipadName;
	public int getIpadId() {
		return ipadId;
	}
	public void setIpadId(int ipadId) {
		this.ipadId = ipadId;
	}
	public String getIpadName() {
		return ipadName;
	}
	public void setIpadName(String ipadName) {
		this.ipadName = ipadName;
	}
	@Override
	public String toString() {
		return "Ipad [ipadId=" + ipadId + ", ipadName=" + ipadName + "]";
	}
	public Ipad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ipad(int ipadId, String ipadName) {
		super();
		this.ipadId = ipadId;
		this.ipadName = ipadName;
	}
	
	

}

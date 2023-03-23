package ManyToMany;

public class IPad {
	
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
	public IPad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IPad(int ipadId, String ipadName) {
		super();
		this.ipadId = ipadId;
		this.ipadName = ipadName;
	}
	
	
	
}
	

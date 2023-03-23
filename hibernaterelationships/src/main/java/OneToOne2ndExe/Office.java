package OneToOne2ndExe;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Office {
	@Id
	private int oId;
	private String OfficeLocation;
	
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getOfficeLocation() {
		return OfficeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		OfficeLocation = officeLocation;
	}

}

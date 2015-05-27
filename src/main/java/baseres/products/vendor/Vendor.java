package baseres.products.vendor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vendor {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	String name;
	
	@ManyToOne
	private VendorGroup group;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

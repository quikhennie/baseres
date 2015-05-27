package baseres.products.vendor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VendorGroup {
	/*
	 * Example Pick n pay, Checkers etc...
	 */
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	String name;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}

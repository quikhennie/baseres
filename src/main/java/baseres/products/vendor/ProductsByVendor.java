package baseres.products.vendor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import baseres.products.Product;

@Entity
@Table(uniqueConstraints = { 
        @UniqueConstraint(columnNames = {"product_id", "vendor_group_id"})}) 
public class ProductsByVendor {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	@ManyToOne
	@JoinColumn(name="vendor_group_id")
	private VendorGroup vendor_group;
}

package baseres.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import baseres.products.brand.Brand;

@Entity
public class Product {
	
	public Product() {
		
	}
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(unique=true, nullable=false)
	String barcode;
	@Column(nullable=false)
	double size;
	@Column(nullable=false)
	double packSize;
	@Column(nullable=false)
	double costPrice;
	String supplierProductCode;
	@Column(nullable=false)
	String description;
	
	@ManyToOne
	@JoinColumn(name="brand_id")
	private Brand brand;
	
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public Product(String barcode) {
		 this.barcode = barcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getPackSize() {
		return packSize;
	}

	public void setPackSize(double packSize) {
		this.packSize = packSize;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	public String getSupplierProductCode() {
		return supplierProductCode;
	}

	public void setSupplierProductCode(String supplierProductCode) {
		this.supplierProductCode = supplierProductCode;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + id + ", barcode=" + barcode
				+ ", size=" + size + ", packSize=" + packSize + ", costPrice="
				+ costPrice + ", supplierProductCode=" + supplierProductCode
				+ ", description=" + description + ", brand=" + brand + "]";
	}
	
	
}

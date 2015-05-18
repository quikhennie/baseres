package baseres.products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	String barcode;
	String brandName;
	String vendorCode;
	double size;
	double packSize;
	double costPrice;
	String supplierProductCode;
	String description;
	
	public Product() {
		
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

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
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
		return "Product [id=" + id + ", barcode=" + barcode + ", brandName="
				+ brandName + ", vendorCode=" + vendorCode + ", size=" + size
				+ ", packSize=" + packSize + ", costPrice=" + costPrice
				+ ", supplierProductCode=" + supplierProductCode
				+ ", description=" + description + "]";
	}

}

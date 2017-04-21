package Pojo;

public class ProductSupplier {

	private String supplierName;
	private String supplierLocation;
	
	public ProductSupplier() {
		super();
	}

	public ProductSupplier(String supplierName, String supplierLocation) {
		super();
		this.supplierName = supplierName;
		this.supplierLocation = supplierLocation;
	}
	
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierLocation() {
		return supplierLocation;
	}
	public void setSupplierLocation(String supplierLocation) {
		this.supplierLocation = supplierLocation;
	}

	@Override
	public String toString() {
		return "ProductSupplier [supplierName=" + supplierName + ", supplierLocation=" + supplierLocation + "]";
	}
	
	
	
}

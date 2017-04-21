package Pojo;

public class Product {

	private int productId;
	private String name;
	private int price;
	private String Brand;
	private String description;
	private String supplier;
	private int rating;
	private String comments;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Product(int productId, String name, int price, String brand, String description, String supplier,
			int rating, String comments) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		Brand = brand;
		this.description = description;
		this.supplier = supplier;
		this.rating = rating;
		this.comments = comments;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", Brand=" + Brand
				+ ", description=" + description + ", supplier=" + supplier + ", rating=" + rating + ", comments="
				+ comments + "]";
	}
	
	
	
	
	
}

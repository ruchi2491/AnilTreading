package Pojo;

public class ProductComments {

	private String comment;
	private String postedBy;
	
	public ProductComments(String comment, String postedBy) {
		super();
		this.comment = comment;
		this.postedBy = postedBy;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	@Override
	public String toString() {
		return "ProductComments [comment=" + comment + ", postedBy=" + postedBy + "]";
	}
	
	
	
}

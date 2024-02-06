package socialNetwork;

public class Comments {

	public String author;
	public String comment;
	
	public Comments(String author, String comment) {
		super();
		this.author = author;
		this.comment = comment;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}


	@Override
	public String toString() {
		return "Comments [author=" + author + ", comment=" + comment + "]";
	}
	
	
	
	
	
	
}

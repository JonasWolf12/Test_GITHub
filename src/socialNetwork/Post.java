package socialNetwork;

import java.util.ArrayList;

public abstract class Post {

	public long timestamp;
	public int likes;
	ArrayList<Comments>comments = new ArrayList<>();
	
	
	public Post(long timestamp, int likes, ArrayList<Comments> comments) {
		super();
		this.timestamp = timestamp;
		this.likes = likes;
		this.comments = comments;
		
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public ArrayList<Comments> getComments() {
		return comments;
	}
	public void setComments(ArrayList<Comments> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Post [timestamp=" + timestamp + ", likes=" + likes + ", comments=" + comments + "]";
	}
	
	
	public void addPost() {
		
	}
	
	public void removePost() {
		
	}
	
	public void addLike() {
		
	}
	
	
	public void removeLike() {
		
	}
	
	
	
}

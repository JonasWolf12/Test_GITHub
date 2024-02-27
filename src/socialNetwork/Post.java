package socialNetwork;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class Post {

	private String username;
	private LocalDateTime timestamp;
	private int likes;
	ArrayList<Comments>comments;
	
	
	
	public Post(String username) {
		super();
		this.username = username;
		this.timestamp = LocalDateTime.now();
		this.likes = 0;
		this.comments = new ArrayList<>();
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
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
	
	
	
	
	public void addLike() {
		this.likes ++;
	}
	
	
	public void removeLike() {
		if(this.likes > 0) {
			this.likes --;
		}
	}
	
	public void time() {
		long timeOfPost = ChronoUnit.DAYS.between(getTimestamp(), LocalDateTime.now());
		if(timeOfPost > 60) {
			
		}
	
	
	


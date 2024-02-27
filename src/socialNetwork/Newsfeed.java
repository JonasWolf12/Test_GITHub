package socialNetwork;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Newsfeed {

	
	private ArrayList<Post>post = new ArrayList<>();

	

	public Newsfeed() {
		this.post = new ArrayList<>();
	}

	public ArrayList<Post> getPost() {
		return post;
	}

	public void setPost(ArrayList<Post> post) {
		this.post = post;
	}
	
	
	public void addPost(Post post) {
		if(!this.post.contains(post)) {
			this.post.add(post);
		}
	}
	
	public void removePost(Post post) {
		if(this.post.contains(post)) {
			this.post.remove(post);
		}
	}
	
	
	public void searchAllPost(String username) {
		for( Post p : this.post  ) {
			if(p.getUsername().equals(username)) {
				System.out.println(p);
			}
		}
	}
	
	
	public void outputOfAllPosts() {
		for( Post p : this.post) {
			System.out.println(p);
		}
	}
	
	
	public void searchMessageSubmission(String username) {
		for( Post p : this.post  ) {
			if(p.getUsername().equals(username) && p instanceof MessageSubmission) {
				System.out.println(p);
			}
		}
	}

	
	public void searchPhotoSubmission(String username) {
		for( Post p : this.post  ) {
			if(p.getUsername().equals(username) && p instanceof PhotoSubmission) {
				System.out.println(p);
			}
		}
	}
	
	
	
	
	
}

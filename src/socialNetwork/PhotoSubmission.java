package socialNetwork;

import java.util.ArrayList;

public class PhotoSubmission extends Post {

	private String headline;
	private String picture;
	
	

	public PhotoSubmission(String username, String headline,
			String picture) {
		super(username);
		this.headline = headline;
		this.picture = picture;
	}



	public String getHeadline() {
		return headline;
	}



	public void setHeadline(String headline) {
		this.headline = headline;
	}



	public String getPicture() {
		return picture;
	}



	public void setPicture(String picture) {
		this.picture = picture;
	}

	
	
	
}

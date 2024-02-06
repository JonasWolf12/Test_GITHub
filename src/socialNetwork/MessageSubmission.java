package socialNetwork;

import java.util.ArrayList;

public class MessageSubmission extends Post {

	private String textmassage;
	
	

	public MessageSubmission(long timestamp, int likes, ArrayList<Comments> comments, String textmassage) {
		super(timestamp, likes, comments);
		this.textmassage = textmassage;
	}

	public String getTextmassage() {
		return textmassage;
	}

	public void setTextmassage(String textmassage) {
		this.textmassage = textmassage;
	}
	
	
	
	
}

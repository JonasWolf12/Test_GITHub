package socialNetwork;

import java.util.ArrayList;

public class MessageSubmission extends Post {

	private String textmassage;
	
	

	public MessageSubmission(String username, String textmassage) {
		super(username);
		this.textmassage = textmassage;
	}

	public String getTextmassage() {
		return textmassage;
	}

	public void setTextmassage(String textmassage) {
		this.textmassage = textmassage;
	}
	
	
	
	
}

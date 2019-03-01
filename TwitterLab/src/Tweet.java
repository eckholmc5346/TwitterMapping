/**
 * The purpose of this class is to encapsulate a tweet
 * @author cteckholm
 *
 */
import java.util.*;
import twitter4j.GeoLocation;
public class Tweet {
	private String user, text;
	private GeoLocation location;
	private Date date;
	private double sentiment;
	
	public Tweet(String user, String text, 
			GeoLocation location, Date date) {
		this.user = user;
		this.text = text;
		this.location = location;
		this.date = date;
		calculateSentiment();
	}
	
	public String getUser() { return user; }
	public String getText() { return text; }
	public GeoLocation getLocation() { return location; }
	public Date getDate() { return date; }
	
	public void calculateSentiment() {
		
	}
	

}

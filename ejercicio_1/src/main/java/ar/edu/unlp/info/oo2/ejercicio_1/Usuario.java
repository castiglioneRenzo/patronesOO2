package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.List;

public class Usuario {
	private String screenName;
	private String email;
	private List tweets;
	public String getScreenName() {
		return this.screenName;
	}
	public Usuario(String screenName, String email) {
		this.email = email;
		this.screenName = screenName;
	}
	public void newTweet(String text) {
		Tweet tweet = new Tweet(text);
		this.tweets.add(tweet);
	}
	public void retweet(Tweet tweet) {
		this.tweets.add(tweet);
	}
}

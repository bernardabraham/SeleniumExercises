package com.pluralsight;

public class HomePage {
	
	static String url = "http://thedemosite.co.uk/";
	static String title ="FREE example PHP code and online MySQL database - example username password protected site";
	
	public void goTo() {
		Browser.goTo(url);
	}
	
	public boolean isAt() {
		return Browser.title().equals(title);
	}
}


package com.pluralsight;

public class HomePage {
	
	
	
	public void goTo() {
//		Browser.goTo(url);
	}
	
	public boolean isAt(String title) {
		return Browser.title().equals(title);
		
	}
}


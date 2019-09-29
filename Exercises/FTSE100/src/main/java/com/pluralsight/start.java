package com.pluralsight;

public class start {

	public static void main(String[] args) {
		
		System.out.println("hi");
		Browser.goTo("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
		Browser.getLargestRiser();
	}
}

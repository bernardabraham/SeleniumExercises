package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//selenium test code here

public class Browser {
	
		static WebDriver driver = new ChromeDriver();
		

		public static void goTo(String url){
			driver.get(url);
		}

		public static String title() {
			return driver.getTitle();
		}
		
		public static void close() {
			try{
				driver.close();
			}		
			catch (Exception e){
			      System.out.println("Nothing to do with it");
		}
	
}
}

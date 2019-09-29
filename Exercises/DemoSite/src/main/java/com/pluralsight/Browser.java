package com.pluralsight;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//selenium test code here

public class Browser {
	
		static WebDriver driver = new ChromeDriver();
		
		static String url = "http://thedemosite.co.uk/";
		
	  
		public static void goTo(String url){
			driver.get(url);
			 driver.manage().window().setSize(new Dimension(980, 1040));
		}

		
		public static void  register() {
			driver.findElement(By.linkText("3. Add a User")).click();
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("1234");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("1234");
		    driver.findElement(By.name("FormsButton2")).click();
			
		}
		
		public static void  login() {
			 driver.findElement(By.linkText("4. Login")).click();
			    driver.findElement(By.name("username")).click();
			    driver.findElement(By.name("username")).sendKeys("1234");
			    driver.findElement(By.cssSelector("table:nth-child(1) tr:nth-child(3) > td:nth-child(1)")).click();
			    driver.findElement(By.name("password")).click();
			    driver.findElement(By.name("password")).sendKeys("1234");
			    driver.findElement(By.name("FormsButton2")).click();
			
		}
		
		public static boolean  success() {
			assertThat(driver.findElement(By.cssSelector("center > b")).getText(), is("**Successful Login**"));
		    assertThat(driver.findElement(By.cssSelector("center > b")).getText(), is("**Successful Login**"));
		    
		    return true;
		}


		public static String title() {
			return driver.getTitle();
		}
		    
	
}

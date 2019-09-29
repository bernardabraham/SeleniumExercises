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
			   
			    driver.findElement(By.linkText("REGISTER")).click();
			    driver.findElement(By.name("firstName")).click();
			    driver.findElement(By.name("firstName")).sendKeys("pete");
			    driver.findElement(By.name("lastName")).sendKeys("davidson");
			    driver.findElement(By.name("phone")).sendKeys("01695320330");
			    driver.findElement(By.cssSelector("form tr:nth-child(7)")).click();
			    driver.findElement(By.name("address1")).click();
			    driver.findElement(By.name("address1")).sendKeys("14 dawson road");
			    driver.findElement(By.name("city")).sendKeys("ormskirk");
			    driver.findElement(By.name("postalCode")).sendKeys("l391ts");
			    driver.findElement(By.name("country")).click();
			    {
			      WebElement dropdown = driver.findElement(By.name("country"));
			      dropdown.findElement(By.xpath("//option[. = 'UNITED KINGDOM']")).click();
			    }
			    driver.findElement(By.name("country")).click();
			    driver.findElement(By.id("email")).click();
			    driver.findElement(By.id("email")).sendKeys("petedavidson");
			    driver.findElement(By.name("password")).sendKeys("pete123");
			    driver.findElement(By.name("confirmPassword")).sendKeys("pete123");
			    driver.findElement(By.name("register")).click();
			
		}
		
		public static void  login() {
			driver.findElement(By.linkText("sign-in")).click();
		    driver.findElement(By.name("userName")).click();
		    driver.findElement(By.name("userName")).sendKeys("petedavidson");
		    driver.findElement(By.name("password")).sendKeys("pete123");
		    driver.findElement(By.name("login")).click();
			
		}
		public static void  findFlights() {
			driver.findElement(By.name("passCount")).click();
		    {
		      WebElement dropdown = driver.findElement(By.name("passCount"));
		      dropdown.findElement(By.xpath("//option[. = '2']")).click();
		    }
		    driver.findElement(By.name("passCount")).click();
		    driver.findElement(By.cssSelector("input:nth-child(4)")).click();
		    driver.findElement(By.name("airline")).click();
		    {
		      WebElement dropdown = driver.findElement(By.name("airline"));
		      dropdown.findElement(By.xpath("//option[. = 'Unified Airlines']")).click();
		    }
		    driver.findElement(By.name("airline")).click();
		    driver.findElement(By.name("findFlights")).click();
		
		}
		public static void  goToCheckout() {
			driver.findElement(By.cssSelector("table:nth-child(9) tr:nth-child(4) b")).click();
		    driver.findElement(By.name("reserveFlights")).click();
			
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

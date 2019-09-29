package com.pluralsight;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//selenium test code here

public class Browser {
	
		static WebDriver driver = new ChromeDriver();
		
//		static String url = "http://automationpractice.com/index.php";
		
		
		public static void goTo(String url){
			driver.get(url);
			 driver.manage().window().setSize(new Dimension(980, 1040));
		}
		public static void  itemSearch() {
		driver.findElement(By.id("search_query_top")).click();
	    driver.findElement(By.id("search_query_top")).sendKeys("blouse");
	    driver.findElement(By.name("submit_search")).click();
		}
		
		public static void  addToCart() {
	    driver.findElement(By.cssSelector(".ajax_add_to_cart_button > span")).click();
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
		
		public static String success() {
			
			 WebDriverWait wait = new WebDriverWait(driver, 10);

			 String element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("h2:nth-child(2)"))).getText();
			
		    return element;
		}


		public static String title() {
			return driver.getTitle();
		}
		    
	
}

package com.pluralsight;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;



public class UnitTest extends TestCase {
	
	@Test
	public void testUserRegisterAndLogin() {
		
		Browser.goTo("http://thedemosite.co.uk/");
		Browser.register();
		Browser.login();
		
		
//		Assert.assertTrue(Pages.homePage().isAt());
	}
	@Test
	public void testCanRegister() {
		Browser.goTo("http://thedemosite.co.uk/");
		Browser.register();
		Assert.assertTrue(Pages.homePage().isAt("Add a user - FREE PHP code and SQL"));
	}
	@Test
	public void testGoesToLoginPage() {
		Browser.goTo("http://thedemosite.co.uk/");
		Browser.register();
		Browser.login();
		
		Assert.assertTrue(Pages.homePage().isAt("Login example page to test the PHP MySQL online system"));
	}
	@Test
	public void testLoginFailsWithWrongInfo(/**Exception = IllegalStatementError**/) {
		
	}
	
	@Test
	  public void exercise3() {
	    driver.get("https://www.phptravels.net/");
	    driver.manage().window().setSize(new Dimension(945, 1020));
	    driver.switchTo().frame(0);
	    {
	      WebElement element = driver.findElement(By.linkText("Search by Hotel or City Name"));
	      Action builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Action builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.linkText("Search by Hotel or City Name"));
	      Action builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector(".select2-focused"));
	      Action builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector("body")).click();
	    driver.findElement(By.name("checkin")).click();
	    driver.findElement(By.cssSelector(".datepicker:nth-child(19) tr:nth-child(5) > .day:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".datepicker:nth-child(20) tr:nth-child(5) > .day:nth-child(6)")).click();
	    driver.findElement(By.id("htravellersInput")).click();
	    driver.findElement(By.id("hadultPlusBtn")).click();
	    driver.findElement(By.cssSelector(".pfb0:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) .btn")).click();
	    driver.findElement(By.cssSelector(".core-btn-primary")).click();
	  }

}

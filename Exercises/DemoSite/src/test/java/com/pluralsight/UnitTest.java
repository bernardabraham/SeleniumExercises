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

}

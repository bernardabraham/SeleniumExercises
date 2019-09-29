package com.pluralsight;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class UnitTest extends TestCase {
	

	
	@Test
	public void testSuccessfulLogin() {
		Browser.goTo("http://automationpractice.com/index.php");
		Browser.itemSearch();
		Browser.addToCart();
		//System.out.println(Browser.success());
	assertThat(Browser.success(), is("Product successfully added to your shopping cart"));
		
	}
	
	
	
//	@Test
//	public void testGoesToCheckout() {
//		Browser.goTo("http://automationpractice.com/index.php");
//		Browser.itemSearch();
//		Browser.addToCart();
//		assertTrue(Pages.homePage().isAt("Search - My Store"));
//	}
	


}

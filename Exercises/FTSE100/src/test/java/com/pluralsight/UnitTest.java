package com.pluralsight;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;



public class UnitTest extends TestCase {
	
	@Test
	public void goesToHomepage() {
		Browser.goTo("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
		Assert.assertTrue(Pages.homePage().isAt("FTSE 100: Top 20 fallers | View the FTSE 100 top 20 falling stocks on the day"));
		
	}
	
	
	@Test
	public void testGetRiser() {
		Browser.goTo("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
		Browser.getLargestRiser();
		Assert.assertEquals("British American Tobacco plc",Browser.getLargestRiser());
	}
	
	@Test
	public void testFaller() {
		Browser.goTo("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
		Browser.getLargestFaller();
		Assert.assertEquals("TUI AG",Browser.getLargestFaller());
	}
	
	@Test
	public void testLoginFailsWithWrongInfo(/**Exception = IllegalStatementError**/) {
		
	}

}

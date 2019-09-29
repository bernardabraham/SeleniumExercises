package com.pluralsight;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import cucumber.api.java.Before;
import junit.framework.TestCase;



public class UnitTest extends TestCase {
	
	@Before
	  public void setUp() {
		
		
	  }
	
	@Test
	public void testCanGoToHomePage() {
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().isAt());
		
	}
	
	@After
	public void cleanUp() {
		
		System.out.println("end");
	}
	}

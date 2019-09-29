package com.pluralsight;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//selenium test code here

public class Browser {

	static WebDriver driver = new ChromeDriver();

	static String url = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";

	public static void goTo(String url) {
		driver.get(url);
		driver.manage().window().setSize(new Dimension(980, 1040));
	}

	public static String getLargestRiser() {
		driver.findElement(By.xpath("//div[@id='view-constituents']/ul/li[2]/a/strong")).click();
		String largestRiser = driver.findElement(By.xpath("//tr[@id='ls-row-BATS-L']/td")).getText();
		System.out.println(largestRiser);
		return largestRiser;
	}

	public static String getLargestFaller() {
		driver.findElement(By.xpath("//tr[@id='ls-row-TUI-L']/td")).click();
		String largestFaller = driver.findElement(By.xpath("//tr[4]/td[3]/span")).getText();
		System.out.println(largestFaller);
		return largestFaller;
		
	}

	public static List<String> getBiggestNumber() {
		
		driver.get(url);
		driver.manage().window().setSize(new Dimension(980, 1040));
		List<WebElement> myList = driver.findElements(By.xpath("//tr[3]/td[3]/span"));
		// To store all web elements into list

		List<String> all_elements_text = new ArrayList<String>();
		// If you want to get all elements text into array list

		for (int i = 0; i < myList.size(); i++) {

			all_elements_text.add(myList.get(i).getText());
			System.out.println(myList.get(i).getText());
		}

		return all_elements_text;

	}

	public static String title() {
		return driver.getTitle();
	}

}

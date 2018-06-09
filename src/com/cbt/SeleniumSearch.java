package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/anaf/Documents/Selenium Dependencies/drivers/chromedriver");
		

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com");

	}

}

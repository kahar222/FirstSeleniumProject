package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/anaf/Documents/Selenium Dependencies/drivers/chromedriver");
		

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.com");

	}

}

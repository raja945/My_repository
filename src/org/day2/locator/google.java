package org.day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver google=new ChromeDriver();
	
	google.get("https://www.google.com/");
	WebElement search = google.findElement(By.name("q"));
	search.sendKeys("Green Technologies");
}
}

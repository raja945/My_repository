package org.day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icici {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver login=new ChromeDriver();
		login.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement userid = login.findElement(By.id("DUMMY1"));
		userid.sendKeys("123456789");
		
	}

}

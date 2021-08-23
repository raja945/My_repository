package org.day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			
	WebDriver login=new ChromeDriver();
	login.get("https://netbanking.hdfcbank.com/");
	
	WebElement userid = login.findElement(By.className("pwd_field"));
	userid.sendKeys("qwerty123");
	
}
}

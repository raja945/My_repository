package org.day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	
	WebElement userid = driver.findElement(By.name("username"));
	userid.sendKeys("vgbhjb@gmail.com");
	
	WebElement pw = driver.findElement(By.name("password"));
	pw.sendKeys("78945612");
	
}
}

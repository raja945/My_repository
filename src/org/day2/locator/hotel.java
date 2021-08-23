package org.day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotel {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("http://adactinhotelapp.com/");
	
	WebElement userid = d.findElement(By.className("login_input"));
	userid.sendKeys("qwerty");
	
	WebElement pw = d.findElement(By.name("password"));
	pw.sendKeys("123456");
	
}
}

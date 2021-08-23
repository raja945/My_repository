package org.day4.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques8 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://adactinhotelapp.com/");
	
	WebElement usr = d.findElement(By.id("username"));
	usr.sendKeys("Greens@gmail.com");
	System.out.println(usr.getAttribute("value"));
	
	WebElement pw = d.findElement(By.id("password"));
	pw.sendKeys("12345");
	System.out.println(pw.getAttribute("value"));
	
	d.quit();
	
	
	
}
}

package org.day4.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/ ");
	
	d.manage().window().maximize();
	
	WebElement txt1 = d.findElement(By.id("email"));
	txt1.sendKeys("Greens@gmail.com");
	System.out.println(txt1.getAttribute("value"));
	
	WebElement txt2 = d.findElement(By.id("pass"));
	txt2.sendKeys("12345");
	System.out.println(txt2.getAttribute("value"));
	d.close();
}
}

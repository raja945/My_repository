package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques5 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	
	d.get("http://greenstech.in/selenium-course-content.html");
	
	d.findElement(By.xpath("//div[@id='heading20']")).click();
	
	d.findElement(By.xpath("//a[text()='CTS Interview Question ']")).click();
	
	
}
}

package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques8 {public static void main(String[] args) {
	

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	
	d.get("http://greenstech.in/selenium-course-content.html");
	
	d.findElement(By.xpath("//div[@id='heading201']")).click();
	
	d.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]")).click();
}
}
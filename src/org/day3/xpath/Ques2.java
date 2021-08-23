package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	
	d.get("https://www.facebook.com/");
	
	d.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("Greens@gmail.com");
	d.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("12345");
	
	d.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	
	//d.close();
}
}

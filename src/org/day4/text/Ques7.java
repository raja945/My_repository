package org.day4.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques7 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://www.google.com/");
	
	d.findElement(By.name("q")).sendKeys("greens velmurugan");
	
	d.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
	
	Thread.sleep(2000);
	
	d.findElement(By.xpath("(//h3[text()='Velmurugan K - Technical Manager - GTL Limited | LinkedIn'])")).click();
	
	d.quit();
	
}
}

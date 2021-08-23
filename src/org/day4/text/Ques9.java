package org.day4.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques9 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.snapdeal.com/");
	
	WebElement enter = d.findElement(By.id("inputValEnter"));
	enter.sendKeys("earphones");
	
	WebElement search = d.findElement(By.className("searchTextSpan"));
	search.click();
	
	Thread.sleep(2000);
	
	WebElement pro1 = d.findElement(By.xpath("(//p[@class='product-title'])[1]"));
	pro1.click();
	//d.quit();
}
}

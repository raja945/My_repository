package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques17 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.flipkart.com");
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions action=new Actions(d);
		
		WebElement mo1 = d.findElement(By.xpath("//img[@alt='Fashion']"));
		action.moveToElement(mo1).perform();
		
		WebElement mo2 = d.findElement(By.xpath("//a[text()='Women Footwear']"));
		action.moveToElement(mo2).perform();
		
		WebElement mo3 = d.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]"));
		action.moveToElement(mo3).click().perform();
		
}
}

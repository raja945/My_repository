package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques13 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.snapdeal.com/");
		
		Actions a=new Actions(d);
		
		WebElement mo1 = d.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		a.moveToElement(mo1).perform();
		
		WebElement mo2 = d.findElement(By.xpath("//span[text()='New Launches Covers']"));
		
		a.moveToElement(mo2).click().perform();
		
}
}
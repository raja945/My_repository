package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques12 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.homedepot.com/");
		
		Actions a=new Actions(d);
		
		WebElement alldept = d.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(alldept).perform();
		
		WebElement paint = d.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		a.moveToElement(paint).perform();
		
		WebElement int_paint = d.findElement(By.xpath("(//a[text()='Interior Paint'])[1]"));
		a.moveToElement(int_paint).perform();
		
		WebElement ceilpaint = d.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		a.moveToElement(ceilpaint).click().perform();
}
}
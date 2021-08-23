package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques11 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.homedepot.com/");
		
		Actions a=new Actions(d);
		
		WebElement alldept = d.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(alldept).perform();
		
		WebElement heat_cool = d.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
		a.moveToElement(heat_cool).perform();
		
		WebElement ac = d.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		a.moveToElement(ac).perform();
		
		WebElement portac = d.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
		a.moveToElement(portac).click().perform();
		
}
}
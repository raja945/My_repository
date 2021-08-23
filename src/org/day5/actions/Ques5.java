package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques5 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.shopclues.com/wholesale.html");
		
		
		Actions a=new Actions(d);
		WebElement mo1 = d.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(mo1).click().perform();
		
		WebElement mo2 = d.findElement(By.xpath("//a[text()='Weight Gainers']"));
		a.moveToElement(mo2).click().perform();
}
}
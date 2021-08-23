package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques20 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.flipkart.com");
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions action=new Actions(d);
		
		WebElement mo1 = d.findElement(By.xpath("//img[@alt='Appliances']"));
		action.moveToElement(mo1).perform();
		
		WebElement mo2 = d.findElement(By.xpath("//a[text()='Televisions']"));
		action.moveToElement(mo2).click().perform();
		Thread.sleep(3000);
		WebElement mo3 = d.findElement(By.xpath("//img[@alt='Mi 4A PRO 80 cm (32 inch) HD Ready LED Smart Android TV']"));
		action.moveToElement(mo3).click().perform();
}
}

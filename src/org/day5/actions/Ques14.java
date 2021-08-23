package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques14 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.snapdeal.com/");
		
		Actions a=new Actions(d);
		
		WebElement mo1 = d.findElement(By.xpath("(//span[@class='catText'])[7]"));
		a.moveToElement(mo1).perform();
		
		WebElement mo2 = d.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		a.moveToElement(mo2).click().perform();
		
		Thread.sleep(3000);
		WebElement mo3 = d.findElement(By.xpath("(//div[text()='Heels'])"));
		a.moveToElement(mo3).click().perform();
		
		
}
	
}

package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques15 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		
		Actions a=new Actions(d);
		
		WebElement mo1 = d.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		a.moveToElement(mo1).perform();
		
		WebElement mo2 = d.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		a.moveToElement(mo2).click().perform();
		
		Thread.sleep(3000);
		
		d.findElement(By.id("ap_customer_name")).sendKeys("RAJA");
		d.findElement(By.id("ap_phone_number")).sendKeys("9876543210");
		d.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
		d.findElement(By.id("ap_password")).sendKeys("123456");
		d.findElement(By.xpath("//input[@id='continue']")).click();
}
}
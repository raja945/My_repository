package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			 
			d.get("https://www.redbus.in/");
			d.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
			
		
			d.findElement(By.id("signInLink")).click();
			Thread.sleep(3000);
			
			WebElement ip = d.findElement(By.xpath("//input[@id='mobileNoInp']"));
			ip.sendKeys("9876543210");
			
			d.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[1]")).click();
			
			d.findElement(By.xpath("(//span[@class='f-w-b'])")).click();
			
			Thread.sleep(5000);
			
			d.close();
	}
}

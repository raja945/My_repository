package org.day10.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques10 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		
		//to close login page
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		d.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mask");
		d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(3000);
		d.findElement(By.xpath("(//a[@class='s1Q9rs'])[2]")).click();
		
		Thread.sleep(2000);
		Set<String> allId = d.getWindowHandles();
		for (String childId : allId) {
			if (!childId.equals(d.getWindowHandle())) {
				d.switchTo().window(childId);
			}
		}
		d.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("600044");
		
	}
	}


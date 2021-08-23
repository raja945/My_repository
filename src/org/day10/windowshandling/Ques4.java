package org.day10.windowshandling;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.greenstechnologys.com/python-training.html");
		Thread.sleep(15000);
		d.findElement(By.xpath("(//button[@class='close'])[1]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//h3[text()='Selenium Test Papers']")).click();
		d.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
		d.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		
		d.quit();
}
}
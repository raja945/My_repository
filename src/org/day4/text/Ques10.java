package org.day4.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques10 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	//d.manage().window().maximize();
	d.get("https://www.flipkart.com/");
	
	d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	
	WebElement enter = d.findElement(By.name("q"));
	enter.sendKeys("earphones");
	
	WebElement search = d.findElement(By.xpath("//button[@type='submit']"));
	search.click();
	Thread.sleep(2000);
	
	WebElement pro1 = d.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
	pro1.click();
	d.quit();
}}

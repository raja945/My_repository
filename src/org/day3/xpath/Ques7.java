package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			
			d.get("https://www.cleartrip.com/trains");
			
			WebElement fromst = d.findElement(By.id("from_station"));
			fromst.sendKeys("Chennai");
			
			WebElement tost = d.findElement(By.id("to_station"));
			tost.sendKeys("nagercoil");
			
			WebElement search = d.findElement(By.id("trainFormButton"));
			search.click();
			
}}

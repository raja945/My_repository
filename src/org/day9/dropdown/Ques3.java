package org.day9.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		Thread.sleep(2000);
		WebElement year = d.findElement(By.id("year"));
		
		Select s=new Select(year);
		System.out.println(s.isMultiple());
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement eachOption = options.get(i);
			System.out.println(eachOption.getAttribute("value"));
		}
		
	}}
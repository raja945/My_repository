package org.day10.windowshandling;

import java.awt.AWTException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.snapdeal.com/");
		WebElement enter = d.findElement(By.id("inputValEnter"));
		enter.sendKeys("iphone 7");
		WebElement search = d.findElement(By.className("searchTextSpan"));
		search.click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("(//img[@title='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Black'])[1]")).click();
		
		Set<String> windowsId = d.getWindowHandles();
		for (String childId : windowsId) {
			if (!childId.equals(d.getWindowHandle())) {
				d.switchTo().window(childId);
			}
		}
		Thread.sleep(2000);
		System.out.println("Price: "+d.findElement(By.xpath("//span[@itemprop='price']")).getText());
		d.quit();
	}
}
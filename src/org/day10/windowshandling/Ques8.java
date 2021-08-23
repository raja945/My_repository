package org.day10.windowshandling;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques8 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.snapdeal.com/");
		
		d.findElement(By.id("inputValEnter")).sendKeys("hand sanitizer");
		d.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//picture[@class='picture-elem'])[1]")).click();
		
		Set<String> allId = d.getWindowHandles();
		for (String childId : allId) {
			if (!childId.equals(d.getWindowHandle())) {
				d.switchTo().window(childId);
			}
		}
		
		d.findElement(By.xpath("//span[text()='add to cart']")).click();
	//d.quit();	
	}		
}

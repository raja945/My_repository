package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			
			WebDriver d=new ChromeDriver();
			
			d.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
			WebElement num = d.findElement(By.xpath("//input[@type='tel']"));
			num.sendKeys("9876543210");
			
			WebElement cont = d.findElement(By.xpath("//div[@class='submitBottomOption']"));
			cont.click();
	}
			
}

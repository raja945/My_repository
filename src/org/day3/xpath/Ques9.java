package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		
		WebElement usr = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		usr.sendKeys("Greens@gmail.com");
		
		WebElement pw = d.findElement(By.xpath("//input[@type='password']"));
		pw.sendKeys("1345678");
		
			d.quit();
		}
			
}

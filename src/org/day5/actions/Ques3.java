package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques3 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		//d.manage().window().maximize();
		d.get("http://www.flipkart.com");
		//to close login page
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions action=new Actions(d);
		
		WebElement home = d.findElement(By.xpath("(//div[@class='_1mkliO'])[6]"));
		action.moveToElement(home).perform();
		
		d.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']")).click();
		
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//span[text()='Home & Furniture']")).click();;
		
		
		d.findElement(By.xpath("//a[text()='Bath Towels']")).click();
}
}

package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques6 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://greenstech.in/selenium-course-content.html");
		
		Actions a=new Actions(d);
		
		WebElement mo1 = d.findElement(By.xpath("//div[@class='header-browse-greens']"));
		a.moveToElement(mo1).perform();
		
		WebElement mo2 = d.findElement(By.xpath("//div[@title='Software Testing']"));
		a.moveToElement(mo2).perform();
		
		WebElement mo3 = d.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		a.moveToElement(mo3).click().perform();
		
		
		
}
}

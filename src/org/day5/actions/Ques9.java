package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques9 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://greenstech.in/selenium-course-content.html");
		
		Actions a=new Actions(d);
		
		WebElement courses = d.findElement(By.xpath("//div[@class='header-browse-greens']"));
		a.moveToElement(courses).perform();
		
		WebElement rpa = d.findElement(By.xpath("//span[text()='RPA (6)']"));
		a.moveToElement(rpa).perform();
		
		WebElement blueprism = d.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		a.moveToElement(blueprism).click().perform();
}
}
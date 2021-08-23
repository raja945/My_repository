package org.day12.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement pgDown = d.findElement(By.xpath("//h2[contains(text(),'Framework Test Papers')]"));
	JavascriptExecutor js=(JavascriptExecutor)d;
	
	js.executeScript("arguments[0].scrollIntoView(true)", pgDown);
	
}
}

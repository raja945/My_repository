package org.day10.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques5 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://www.greenstechnologys.com/");
	WebElement courses = d.findElement(By.xpath("//a[text()='COURSES']"));
	
	Actions a=new Actions(d);
	a.moveToElement(courses).perform();
	
	d.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/python-training.html'])[1]")).click();
	
	Thread.sleep(15000);
	d.findElement(By.xpath("(//button[@class='close'])[1]")).click();
	
	WebElement expCurri = d.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
	JavascriptExecutor js=(JavascriptExecutor) d;
	js.executeScript("arguments[0].scrollIntoView(true)", expCurri);
	a.contextClick(expCurri).perform();
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
}
}

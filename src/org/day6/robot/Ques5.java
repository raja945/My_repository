package org.day6.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques5 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement modelres = d.findElement(By.xpath("//h2[contains(text(),'Model Resumes')]"));
		modelres.click();
		
		WebElement res4 = d.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		
		Actions a=new Actions(d);
		a.contextClick(res4).perform();
		
		Robot r=new Robot();
		for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
			
		}
}

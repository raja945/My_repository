package org.day6.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques4 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement framework = d.findElement(By.xpath("//h2[contains(text(), 'Framework Test Papers')]"));
		
		Actions a=new Actions(d);
		a.moveToElement(framework).click(framework).contextClick(framework).build().perform();
		
		Robot r=new Robot();
		for (int i = 0; i < 9; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
			
		}
}

package org.day10.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.amazon.in/");
	d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone X");
	d.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);
	WebElement product = d.findElement(By.xpath("//span[text()='New Apple iPhone 11 (64GB) - Yellow']"));
	
	Actions a=new Actions(d);
	a.contextClick(product).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	Set<String> windowsId = d.getWindowHandles();
	for (String childId : windowsId) {
		if (!childId.equals(d.getWindowHandle())) {
			d.switchTo().window(childId);
		}
	}
	Thread.sleep(5000);
	WebElement price = d.findElement(By.xpath("//td[@class='a-span12']"));
	System.out.println(price.getText());
	Thread.sleep(5000);
	d.quit();
}}

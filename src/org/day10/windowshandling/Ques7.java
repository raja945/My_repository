package org.day10.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://greenstech.in/selenium-course-content.html");
	d.findElement(By.xpath("//h2[contains(text(),'Core Java Test papers')]")).click();
	d.findElement(By.xpath("//a[@href='http://traininginchennai.in/Day4_ControlStatements.txt']")).click();
	
	Set<String> allId = d.getWindowHandles();
	for (String childId : allId) {
		if (!childId.equals(d.getWindowHandle())) {
			d.switchTo().window(childId);
		}
	}
	WebElement locator = d.findElement(By.xpath("//pre[contains(text(),'Day4_ControlStatements')]"));
	String text = locator.getText();
	int firstind = text.indexOf("QUESTIONS(Theory)");
	int lastind = text.indexOf("2.Whether");
	
	String substring = text.substring(firstind, lastind);
	System.out.println(substring);
	d.quit();
}
}

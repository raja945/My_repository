package org.day10.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
WebDriver d=new ChromeDriver();
d.manage().window().maximize();
d.get("http://greenstech.in/selenium-course-content.html");
d.findElement(By.xpath("//div[@id='heading304']")).click();
d.findElement(By.xpath("//a[text()=' JUNIT']")).click();
Thread.sleep(3000);
Set<String> allId = d.getWindowHandles();
for (String childId : allId) {
	if (!childId.equals(d.getWindowHandle()))
		d.switchTo().window(childId);
	}
WebElement locator = d.findElement(By.xpath("//pre[contains(text(),'JUNIT')]"));
String text = locator.getText();
int firstind = text.indexOf("QUESTIONS(Practical)");
int lastind = text.indexOf("QUESTION 2");

String substring = text.substring(firstind,lastind);
System.out.println(substring);
d.quit();
}
}


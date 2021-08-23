package org.day10.windowshandling;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques14 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://greenstech.in/selenium-course-content.html");
		d.findElement(By.xpath("(//h2[@class='mb-0'])[6]")).click();
		d.findElement(By.xpath("//a[text()=' TESTNG']")).click();
		
		Set<String> allId = d.getWindowHandles();
		for (String childId : allId) {
			if (!childId.equals(d.getWindowHandle())) {
				d.switchTo().window(childId);
			}
		}
		WebElement locator = d.findElement(By.xpath("//pre[contains(text(),'TESTNG')] "));
		String text = locator.getText();
		int firstind = text.indexOf("QUESTION 4");
		int lastind = text.indexOf("QUESTION 5");
		String substring = text.substring(firstind,lastind);
		System.out.println(substring);
		
		
		d.quit();
}

}

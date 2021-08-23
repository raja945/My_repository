package org.day10.windowshandling;

import java.awt.AWTException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.homedepot.com/");
		d.findElement(By.xpath("//label[@for='headerSearch']")).sendKeys("Ceiling fan");
		d.findElement(By.className("SearchBox__searchBar"));
		
		Set<String> windowsId = d.getWindowHandles();
		for (String childId : windowsId) {
			if (!childId.equals(d.getWindowHandle())) {
				d.switchTo().window(childId);
			}
		}
		Thread.sleep(3000);
		d.findElement(By.xpath("(//a[text()='Indoor Ceiling Fans with Remotes'])[1]")).click();
		
		d.quit();
}
}
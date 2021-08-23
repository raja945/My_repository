package org.day7.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques10 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("motorola");
		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		TakesScreenshot tk=(TakesScreenshot) d;
		
		File src=tk.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Screenshot\\ques10.png");
		
		FileUtils.copyFile(src, des);
}
}

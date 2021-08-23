package org.day7.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://greenstech.in/selenium-course-content.html");
		
		JavascriptExecutor js=(JavascriptExecutor) d;
		WebElement pgDown = d.findElement(By.xpath("//h3[contains(text(),'Top Selenium Trends In 2020')]"));
	
		js.executeScript("arguments[0].scrollIntoView(true)", pgDown); 
		
		TakesScreenshot tk=(TakesScreenshot) d;
		
		File src=tk.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Screenshot\\ques6.png");
		
		FileUtils.copyFile(src, des);
}
}

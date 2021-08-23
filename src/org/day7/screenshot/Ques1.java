package org.day7.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot tk=(TakesScreenshot) d;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Screenshot\\gt.png");
		
		FileUtils.copyFile(src, des);
	}
}

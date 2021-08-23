package org.day1.browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques1_1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
	}
}

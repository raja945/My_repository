package org.day1.browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ques1_3 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", 
			"C:\\Users\\welcome\\eclipse-workspace\\Selenium_Browser_Launch\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.amazon.in");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	//driver.quit();
}
}

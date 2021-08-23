package org.day1.browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques1_4 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium_Browser_Launch\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
	}

}

package org.day1.browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2_4 {
 public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver", 
			 "C:\\Users\\welcome\\eclipse-workspace\\Selenium_Browser_Launch\\Drivers\\chromedriver.exe");
	 WebDriver d=new ChromeDriver();
	 
	 d.get("http://greenstech.in/selenium-course-content.html");
	 
	 String title = d.getTitle();
	 System.out.println(title);
	 
	 String url = d.getCurrentUrl();
	 System.out.println(url);
	 
	 //d.quit();
}
}

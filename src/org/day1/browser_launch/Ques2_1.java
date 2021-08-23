package org.day1.browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.greenstechnologys.com/");
		
		String title = d.getTitle();
		System.out.println(title);
		
		String url = d.getCurrentUrl();
		System.out.println(url);
		
		d.close();
	}
}

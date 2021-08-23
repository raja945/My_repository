package org.day1.browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ques3_2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium_Browser_Launch\\Drivers\\msedgedriver.exe");
		WebDriver d=new EdgeDriver();
		
		d.get("http://demo.automationtesting.in/Register.html");
		
		String title = d.getTitle();
		System.out.println(title);
		
		String url = d.getCurrentUrl();
		System.out.println(url);
		
		d.quit();
	}

}

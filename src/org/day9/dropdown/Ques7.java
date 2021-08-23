package org.day9.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = d.findElement(By.name("country"));
		
		Select s=new Select(country);
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		for (WebElement eachOption : options) {
			System.out.println(eachOption.getAttribute("value"));
}
		d.quit();
}
}

package org.day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver red=new ChromeDriver();
		red.get("https://www.redbus.in/");
		
		WebElement source = red.findElement(By.id("src"));
		source.sendKeys("Chennai");
		
		WebElement destination = red.findElement(By.id("dest"));
		destination.sendKeys("Madurai");
		
		
	}

}

package org.day2.locator;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement checkmail = driver.findElement(By.name("email"));
		checkmail.sendKeys("Greens@gmail.com");
		
		WebElement checkpw = driver.findElement(By.name("pass"));
		checkpw.sendKeys("123456");
		
		WebElement checklogin = driver.findElement(By.name("login"));
		checklogin.click();
		
		driver.close();
		Date d=new Date();
	}

}

package org.day12.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://adactinhotelapp.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)d;

		WebElement usr = d.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','Greens@gmail.com')", usr);
		
		WebElement pw = d.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','1234567')", pw);
		
		WebElement login = d.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", login);
	}
		
}

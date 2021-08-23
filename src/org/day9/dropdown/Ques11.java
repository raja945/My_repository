package org.day9.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://adactinhotelapp.com/");
		
								d.findElement(By.id("username")).sendKeys("RajaGanap");
								d.findElement(By.id("password")).sendKeys("Pgr.pgr@1");
		d.findElement(By.id("login")).click();
		
		WebElement adultRoom = d.findElement(By.id("adult_room"));
		Select s=new Select(adultRoom);
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println("\nNo of Options available"
				+ ": "+allOptions.size());
		d.quit();
	} 
	
}

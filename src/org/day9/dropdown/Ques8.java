package org.day9.dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://adactinhotelapp.com/");
		
		d.findElement(By.id("username")).sendKeys("RajaGanap");
		d.findElement(By.id("password")).sendKeys("Pgr.pgr@1");
		d.findElement(By.id("login")).click();
		
		
		
		d.quit();
}
}

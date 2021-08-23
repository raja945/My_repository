package org.day8.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("http://demo.automationtesting.in/Alerts.html");
		
		d.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		d.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		Alert a = d.switchTo().alert();
		
		a.accept();
}
}
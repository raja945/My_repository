package org.day8.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("http://demo.automationtesting.in/Alerts.html");
		
		d.findElement(By.xpath("//a[@href='#Textbox']")).click();
		
		d.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		Alert a = d.switchTo().alert();
		
		a.accept();
		
}
}

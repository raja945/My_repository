package org.day8.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				
				WebDriver d=new ChromeDriver();
				d.manage().window().maximize();
				
				d.get("https://retail.onlinesbi.com/retail/login.htm");
				
				d.findElement(By.xpath("(//a[@class='login_button'])[1]")).click();
				
				Thread.sleep(2000);
				
				d.findElement(By.xpath("(//input[@class='btn btn-default'])[1]")).click();
				
				Alert a = d.switchTo().alert();
				
				System.out.println(a.getText());
				
				a.accept();
			}
}

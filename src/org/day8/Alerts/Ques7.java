package org.day8.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://netbanking.hdfcbank.com/netbanking");
		
		d.switchTo().frame("login_page");
		
		WebElement usr = d.findElement(By.xpath("//input[@class='input_password']"));
		usr.sendKeys("Greens");
		WebElement login = d.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		login.click();
		Thread.sleep(2000);
		WebElement pw = d.findElement(By.xpath("//input[@name='fldPassword']"));
		pw.sendKeys("123456");
		
}
}

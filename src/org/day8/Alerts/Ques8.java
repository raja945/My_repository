package org.day8.Alerts;

import java.awt.AWTException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques8 {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				
				WebDriver d=new ChromeDriver();
				d.manage().window().maximize();
				
				d.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
				
				d.findElement(By.xpath("//input[@name='DUMMY1']")).sendKeys("Greens");
				
				d.findElement(By.xpath("(//img[@id='user-id-goahead'])[1]")).click();
				
				d.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']")).sendKeys("Greens");
				
				d.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']")).click();
				
				Alert a = d.switchTo().alert();
				
				System.out.println(a.getText());
				
				a.accept();
			
	
}}
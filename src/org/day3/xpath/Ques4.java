package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques4 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	
	d.get("http://toolsqa.com/automation-practice-form/");
	
	WebElement fname = d.findElement(By.id("firstName"));
	fname.sendKeys("Ganapathy");
	
	WebElement lname = d.findElement(By.id("lastName"));
	lname.sendKeys("Raja");
	
	WebElement email = d.findElement(By.id("userEmail"));
	email.sendKeys("abc@gmail.com");
	
	WebElement num = d.findElement(By.id("userNumber"));
	num.sendKeys("987654321");
	
	try {
		WebElement sub = d.findElement(By.className("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3"));
		sub.sendKeys("Tamil");
		
	} catch (Exception e) {
		System.out.println("element not interactable exeception");
	}
	
	
	WebElement adr = d.findElement(By.id("currentAddress"));
	adr.sendKeys("2/27, sj street, chrompet");
	
	
	
}
}

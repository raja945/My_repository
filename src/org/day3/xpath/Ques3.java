package org.day3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	d.get("http://demo.automationtesting.in/Register.html");
	
	WebElement firstname = d.findElement(By.xpath("(//input[@type='text'])[1]"));
	firstname.sendKeys("Ganapathy");
	
	WebElement lastname = d.findElement(By.xpath("(//input[@type='text'])[2]"));
	lastname.sendKeys("Raja");
	
	WebElement address = d.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	address.sendKeys("2/27, Middle St, nainangulam, Tanjavur");
	
	WebElement mail = d.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	mail.sendKeys("abc@gmail.com");
	
	WebElement phone = d.findElement(By.xpath("//input[@type='tel']"));
	phone.sendKeys("987654321");
	
	WebElement pw = d.findElement(By.xpath("//input[@id='firstpassword']"));
	pw.sendKeys("qwerty12");
	
	WebElement conpw = d.findElement(By.xpath("//input[@id='secondpassword']"));
	conpw.sendKeys("qwerty12");
	
	WebElement submit = d.findElement(By.xpath("//button[@id='submitbtn']"));
	submit.click();
	
}
}

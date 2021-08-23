package org.day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	d.get("http://demo.automationtesting.in/Register.html");
	
	WebElement firstname = d.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
	firstname.sendKeys("Ganapathy");
	
	WebElement lastname = d.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
	lastname.sendKeys("Raja");
	
	WebElement address = d.findElement(By.className("form-control ng-valid ng-dirty ng-valid-parse ng-touched"));
	address.sendKeys("2/27, Middle St, nainangulam, Tanjavur");
	
	WebElement mail = d.findElement(By.className("form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched"));
	mail.sendKeys("abc@gmail.com");
	
	WebElement phone = d.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched"));
	phone.sendKeys("987654321");

	WebElement lang = d.findElement(By.id("msdd"));
	lang.sendKeys("Tamil");
	
	WebElement pw = d.findElement(By.id("firstpassword"));
	pw.sendKeys("qwerty12");
	
	WebElement conpw = d.findElement(By.id("secondpassword"));
	conpw.sendKeys("qwerty12");
	
	
	
}
}

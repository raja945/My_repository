package org.day12.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://www.greenstechnologys.com/");
	
	WebElement pgDown = d.findElement(By.xpath("//p[text()='Copyright © 2019 greenstechnologys.com. All Rights Reserved.']"));
	
	JavascriptExecutor js= (JavascriptExecutor) d;
	js.executeScript("arguments[0].scrollIntoView(true)", pgDown);
	
	WebElement print = d.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
	
	String text = print.getText();
	
	System.out.println(text);
}
}

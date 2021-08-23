package org.day4.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement adyaradd = d.findElement(By.xpath("(//p[@class='mail-info'])[1]"));
	System.out.println(adyaradd.getText());
}
}

package org.day4.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	d.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement para = d.findElement(By.xpath("(//p[contains(text(),'Velmurugan')])[2]"));
	String t = para.getText();
	System.out.println(t);
	
	//the paragraph is not printed as the DOM for this text is in grey color
}		


}

package org.day4.text;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://www.greenstechnologys.com");
	
	WebElement txt = d.findElement(By.xpath("//u[text()="
			+ "'Greens Technologys Software Training Centers in Chennai']"));
	String t1 = txt.getText();
	System.out.println(t1);
}
}

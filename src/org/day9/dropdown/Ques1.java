package org.day9.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	d.get("http://demoqa.com/automation-practice-form/");
	d.manage().window().maximize();
	WebElement state = d.findElement(By.xpath("//div[text()='Select State']"));
	JavascriptExecutor js=(JavascriptExecutor) d;
	js.executeScript("arguments[0].scrollIntoView(true)", state);
	state.click();
	
	List<WebElement> options = d.findElements(By.tagName("div"));
	for (WebElement eachOptin : options) {
	System.out.println(eachOptin.getText());
	
	
	}
}
}

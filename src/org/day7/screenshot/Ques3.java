package org.day7.screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://toolsqa.com/");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) d;
		
		WebElement pgDown = d.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView(true)", pgDown);
		
		System.out.println(pgDown.getText());
		
}
}

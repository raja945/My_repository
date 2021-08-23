package org.day12.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		JavascriptExecutor js=(JavascriptExecutor)d;

		WebElement usr = d.findElement(By.xpath("(//input[@class='_2IX_2- VJZDxU'])"));
		js.executeScript("arguments[0].setAttribute('value','Greens@gmail.com')", usr);
		
		WebElement pw = d.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		js.executeScript("arguments[0].setAttribute('value','1234567')", pw);

		Object o1 = js.executeScript("return arguments[0].getAttribute('value')", usr);
		String s1=(String) o1;
		System.out.println(s1);
		
		Object o2 = js.executeScript("return arguments[0].getAttribute('value')", pw);
		String s2=(String) o2;
		System.out.println(s2);
		
		WebElement login = d.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		js.executeScript("arguments[0].click()", login);
		
		
		
	}
}

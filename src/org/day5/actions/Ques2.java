package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.amazon.in");
		
		Actions a=new Actions(d);
		
		WebElement primebutton = d.findElement(By.xpath("//a[@id='nav-link-prime']"));
		a.moveToElement(primebutton).perform();
		
		WebElement fastdel = d.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		fastdel.click();
		}
}
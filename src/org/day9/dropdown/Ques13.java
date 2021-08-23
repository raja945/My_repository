package org.day9.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits = d.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		List<WebElement> all = s.getOptions();
		
		for (int i = 0; i < all.size() ; i++) {
			s.selectByIndex(i);
			
		}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println("Selected options");
		for (WebElement each : allSelectedOptions) {
			System.out.println(each.getText());
		}
		System.out.println("\nFirst Selected Option: ");
		System.out.println(s.getFirstSelectedOption().getText());
		d.quit();
	}
}

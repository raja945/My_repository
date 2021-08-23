package org.day9.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits = d.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size() ; i++) {
			if (i%2==0) {
				s.selectByIndex(i);
			}
		}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement sel : allSelectedOptions) {
			System.out.println(sel.getText());
		}
		System.out.println("Non selected options: " );
		options.removeAll(allSelectedOptions);
		for (WebElement nonsel : options) {
			System.out.println(nonsel.getText());
		}
		d.quit();
	}}

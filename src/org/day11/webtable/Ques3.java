package org.day11.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> allTable = d.findElements(By.tagName("table"));
		System.out.println("No of Tables: "+allTable.size());
		
		WebElement table = d.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		System.out.println("No of rows:"+allRows.size());
		d.quit();
}
}
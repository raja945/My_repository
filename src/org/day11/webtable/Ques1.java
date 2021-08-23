package org.day11.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://demo.guru99.com/test/write-xpath-table.html");
	
	List<WebElement> alltable = d.findElements(By.tagName("table"));
	System.out.println(alltable.size());
	WebElement table = d.findElement(By.xpath("//table[@border='l']"));
	//System.out.println(table.getText());
	List<WebElement> allRows = table.findElements(By.tagName("tr"));
	
	for (int i = 0; i <allRows.size() ; i++) {
		WebElement rows = allRows.get(i);
		System.out.println(rows.getText());
	}
	d.quit();
}
}

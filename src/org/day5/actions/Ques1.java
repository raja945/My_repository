package org.day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/drag_drop.html ");
	
	Actions a=new Actions(driver);
	
	WebElement src51 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
	
	WebElement src52 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
	
	WebElement srcbank = driver.findElement(By.xpath("(//li[@id='credit2'])"));
	
	WebElement srcsales = driver.findElement(By.xpath("(//li[@id='credit1'])"));
	
	WebElement des51 = driver.findElement(By.xpath("(//ol[@id='amt7'])"));
	
	WebElement des52 = driver.findElement(By.xpath("(//ol[@id='amt8'])"));
	
	WebElement desbank = driver.findElement(By.xpath("(//ol[@id='bank'])"));
	
	WebElement dessales = driver.findElement(By.xpath("(//ol[@id='loan'])"));
	
	a.dragAndDrop(src51, des51).perform();
	a.dragAndDrop(src52, des52).perform();
	a.dragAndDrop(srcbank, desbank).perform();
	a.dragAndDrop(srcsales, dessales).perform();
	
	//Thread.sleep(5000);
	
	//driver.close();
}
}

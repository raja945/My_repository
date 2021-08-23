package org.day8.Alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satz\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		d.switchTo().frame("login_page");
		
		WebElement usr = d.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		usr.click();
		Alert a = d.switchTo().alert();
		
		System.out.println(a.getText());
		a.accept();
		
		d.switchTo().parentFrame(); 
		
		java.util.List<WebElement> all = d.findElements(By.tagName("frameset"));
		int size = all.size();
		System.out.println(size);
		
		d.quit();
}
}
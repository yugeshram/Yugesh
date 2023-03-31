package org.day9selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement alertok= driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alertok.click();
		
		WebElement cli = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		cli.click();
		
		org.openqa.selenium.Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.accept();
		
		Thread.sleep(2000);
		
		
		
		WebElement ok = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		ok.click();
		WebElement cancel = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		cancel.click();

		
		
		org.openqa.selenium.Alert ale = driver.switchTo().alert();
		String text3= ale.getText();
		System.out.println(text3);
		ale.dismiss();
		
		
		Thread.sleep(2000);
		
		WebElement alr = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alr.click();
		
		WebElement pro = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		pro.click();
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String text2 = alert.getText();
		System.out.println(text2);
		
		alert.sendKeys("yugeshram");
		String attribute = pro.getAttribute("value");
		System.out.println(attribute);
		
		
		
		
		alert.accept();

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

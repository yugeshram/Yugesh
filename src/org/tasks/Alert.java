package org.tasks;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Alert {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	WebElement cli = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	
	cli.click();
	org.openqa.selenium.Alert al = driver.switchTo().alert();
	al.accept();
	
	WebElement can = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	can.click();
	
	WebElement click = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
	click.click();
	
	org.openqa.selenium.Alert al1 = driver.switchTo().alert();
	al1.dismiss();
	
	WebElement sen = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	sen.click();
	
	WebElement clo = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	clo.click();
	
	
	
	org.openqa.selenium.Alert al3 = driver.switchTo().alert();
	al3.sendKeys("yugesh");
	al3.accept();
	
	
	}
	
}
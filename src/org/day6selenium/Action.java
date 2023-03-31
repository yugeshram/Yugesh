package org.day6selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement close = driver.findElement(By.xpath("//button[text()='×']"));
		close.click();
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(course).perform();
		
		Thread.sleep(2000);
		
		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		
		action.moveToElement(oracle).perform();
		
		
		Thread.sleep(2000);
		
		
		WebElement select = oracle.findElement(By.xpath("//span[text()='Oracle Training']"));
		select.click();
		
		Thread.sleep(2000);
		
		WebElement close2 = select.findElement(By.xpath("//button[text()='×']"));
		close2.click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}

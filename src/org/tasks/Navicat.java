package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navicat {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement textuse = driver.findElement(By.id("email"));
		textuse.sendKeys("fghfffh");
		
		WebElement textpass = driver.findElement(By.id("pass"));
		textpass.sendKeys("123");
		
		driver.navigate().refresh();
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		click.click();
		
		Thread.sleep(2000);
		
		WebElement textuse1 = driver.findElement(By.id("email"));
		textuse1.sendKeys("fghfffh");
		
		WebElement textpass2 = driver.findElement(By.id("pass"));
		textpass2.sendKeys("123");
		
		
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		
		
		
		
		
		
		
		

}
}

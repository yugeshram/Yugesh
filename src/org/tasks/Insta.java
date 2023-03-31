package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html\r\n" );
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		
		//WebElement close = driver.findElement(By.xpath("//button[@type='button']"));
		//close.click();
		
		
		
		
		
		
}
}
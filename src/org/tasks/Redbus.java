package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get(" https://www.redbus.in/");
			
			driver.manage().window().maximize();
			
			WebElement cli = driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
			cli.click();
			
			WebElement cli2 = driver.findElement(By.xpath("//li[@id='signInLink']"));
			cli2.click();
			
			
			WebElement num = driver.findElement(By.xpath("(//input[@class='IP'])[1]"));
			num.sendKeys("8056634931");
			
			WebElement rob = driver.findElement(By.xpath("//label[@aria-hidden='true']"));
			rob.click();
			
			
			
			
			

}
}
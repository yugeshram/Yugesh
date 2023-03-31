package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement cli = driver.findElement(By.xpath("//input[@type='text']"));
		cli.click();
		
		WebElement li = driver.findElement(By.xpath("//input[@type='text']"));
		li.sendKeys("iphone");
		
		WebElement ser = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
		ser.click();
		
		
		
	

}
}

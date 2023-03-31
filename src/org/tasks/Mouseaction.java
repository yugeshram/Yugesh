package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(prime).perform();
		
		WebElement click = driver.findElement(By.xpath("//img[contains(@id,'multiasins-img-link')]"));
		
		click.click();
		
		
		
	
	
	
	
}
}


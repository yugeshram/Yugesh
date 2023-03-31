package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement locate = driver.findElement(By.id("location"));
		
	     locate.sendKeys("thoothukudi");
	     
	     
	    // Actions action = new Actions(driver);
	     
	     //action.moveToElement(locate).perform();
	     
	     
	     WebElement loc = locate.findElement(By.xpath("(//span[@class='_2W-T9'])[1]"));
	     
	    loc.click();
		
		
		
		
		
		
		
		
		
		
	}

}

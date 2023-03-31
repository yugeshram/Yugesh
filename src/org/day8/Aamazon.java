package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aamazon {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.amazon.in/");
     
     driver.manage().window().maximize();
     
     WebElement serch = driver.findElement(By.id("twotabsearchtextbox"));
     // serch.sendKeys("iphone",Keys.ENTER); 
      serch.sendKeys(Keys.SHIFT,"iphone",Keys.ENTER,Keys.SHIFT);
      
      
    
     
     
	
	
	
	
	
	
	
	
	
	}

}

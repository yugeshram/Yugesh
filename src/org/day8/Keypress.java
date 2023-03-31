package org.day8;

import org.day5selinium.Navication;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keypress {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement textuser = driver.findElement(By.id("email"));
		
		textuser.sendKeys("ji hello");
		
		Actions actions = new Actions(driver);
		
	
		
	 // actions.keyDown(Keys.SHIFT).sendKeys("welcome").keyUp(Keys.SHIFT).perform();
	 // actions.keyDown(Keys.TAB).sendKeys("yugesh").keyUp(Keys.TAB).perform();
		
		actions.doubleClick(textuser).perform();
		
		
		
	}

}

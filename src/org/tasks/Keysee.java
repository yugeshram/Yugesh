package org.tasks;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Keysee {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement textuser = driver.findElement(By.name("email"));
	Actions actions = new Actions(driver);
	actions.keyDown(Keys.SHIFT).sendKeys("yuesh ram").keyUp(Keys.SHIFT).perform();
	
	actions.doubleClick(textuser).perform();

}
}

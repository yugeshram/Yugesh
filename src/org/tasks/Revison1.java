package org.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Revison1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement chk = driver.findElement(By.xpath("//a[text()='Gmail']"));
	
	Actions actions = new Actions(driver);
	actions.contextClick(chk).perform();
	Robot r = new Robot();
	
	for (int i = 0; i < 3; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
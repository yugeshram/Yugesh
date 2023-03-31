package org.tasks;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Serch {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement serch = driver.findElement(By.xpath("//input[@type='text']"));
	serch.sendKeys(Keys.SHIFT,"iphoe",Keys.ENTER);
	
	

}
}
package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Revisen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	Actions obj = new Actions(driver);
	WebElement tex = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	obj.moveToElement(tex).perform();
	
	WebElement click = tex.findElement(By.xpath("//span[text()='Sign in']"));
	click.click();
	}

}

package org.day10selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		 opt.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver = new ChromeDriver(opt);
		 
		 driver.get("https://www.amazon.in/");
		 
		 driver.manage().window().maximize();
		 
		 WebElement scroll = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		 
		 JavascriptExecutor exe = (JavascriptExecutor) driver;
		 
		 exe.executeScript("arguments[0].scrollIntoView(true)", scroll);
		 
		 Thread.sleep(2000);
		 
		 WebElement up = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		 exe.executeScript("arguments[0].scrollIntoView(false)", up);
		
	}
	
}

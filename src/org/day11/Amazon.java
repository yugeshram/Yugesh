package org.day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();

	WebElement down = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	TakesScreenshot ss = (TakesScreenshot) down;
	
	 
	JavascriptExecutor exe = (JavascriptExecutor) driver;
	exe.executeScript("arguments[0].scrollIntoView(true)", down);
	
	 File src = down.getScreenshotAs(OutputType.FILE);	
	      
	File dos = new File("C:\\Users\\muthu\\eclipse-workspace\\selenium\\SS\\pic4.png");
	FileUtils.copyFile(src, dos);
		
	
	
	
	
	
	
	}

}

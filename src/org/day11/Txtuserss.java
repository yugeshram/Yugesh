package org.day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Txtuserss { 
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement textuser = driver.findElement(By.id("email"));
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = textuser.getScreenshotAs(OutputType.FILE);
		
		File dos = new File("C:\\Users\\muthu\\eclipse-workspace\\selenium\\SS\\pic1.png");
		
		FileUtils.copyFile(src, dos);
		
		
	}

}

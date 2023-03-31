package org.tasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SS {
	public static void main(String[] args) throws IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ss  = (TakesScreenshot) driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		File fil = new File("C:\\Users\\muthu\\eclipse-workspace\\selenium\\SS/oo.png");
		FileUtils.copyFile(screenshotAs, fil);
		
		
		
		
		
		
		
		
	}

}

package org.tasks;

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

public class Textscreeshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys("yugesh");
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = textuser.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File file = new File("C:\\Users\\muthu\\eclipse-workspace\\selenium\\SS\\img.png");
		FileUtils.copyFile(src, file);
		
	
	
}
}
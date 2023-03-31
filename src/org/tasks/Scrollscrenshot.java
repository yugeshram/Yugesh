package org.tasks;

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

public class Scrollscrenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement down = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		//Thread.sleep(5000);
        ex.executeScript("arguments[0].scrollIntoView('false')", down);	
        //Thread.sleep(3000);
        
        TakesScreenshot ss = (TakesScreenshot) driver;
        //Thread.sleep(3000);
        File src = ss.getScreenshotAs(OutputType.FILE);
        System.out.println(src);
        
        File file = new File("C:\\Users\\muthu\\eclipse-workspace\\selenium\\SS\\down.png");
        FileUtils.copyFile(src, file);

}
}
package org.day5selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navication {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement lnk = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		lnk.click();
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys("ram");
		
		WebElement textpass = driver.findElement(By.id("pass"));
		textpass.sendKeys("1233");
		
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		
	}

}

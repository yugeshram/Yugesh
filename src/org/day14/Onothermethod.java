package org.day14;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Onothermethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement ser = driver.findElement(By.id("twotabsearchtextbox"));
		ser.sendKeys("iphone",Keys.ENTER);
		WebElement cli = driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro (128 GB) - Space Black'])[1]"));
		cli.click();
		
		//parantwindow
		String parantwindow = driver.getWindowHandle();
		System.out.println(parantwindow);
		
		//childwindow
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow);
		
	 java.util.List<String> li = new ArrayList<>();
	 
	   li.addAll(childwindow);
		String child = li.get(1);
		driver.switchTo().window(child);
		
		WebElement crt = driver.findElement(By.id("add-to-cart-button"));
		crt.click();
		
		
		
	
	

}
}
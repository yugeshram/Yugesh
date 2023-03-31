package org.day6selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Dragandrop2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window() .maximize();
		
		WebElement click = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		

		
		Actions actions = new Actions(driver);
		
		Thread.sleep(2000);
		actions.dragAndDrop(click, drop).perform();
		
		WebElement trag = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement drope = driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
		
		Thread.sleep(2000);
		actions.dragAndDrop(trag, drope).perform();
		
		WebElement down = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement up = driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
		
		Thread.sleep(2000);
		actions.dragAndDrop(down, up).perform();
		
		WebElement la = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement laste = driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
		
		Thread.sleep(2000);
		
		actions.dragAndDrop(la, laste).perform();
		
		Thread.sleep(2000);
		
		WebElement perf = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		
		String text = perf.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

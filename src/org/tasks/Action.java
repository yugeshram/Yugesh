package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement clo = driver.findElement(By.xpath("//button[@class='close']"));
		clo.click();
		
		WebElement obj = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(obj).perform();
		
		Thread.sleep(2000);
		
		WebElement orac = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		
		actions.moveToElement(orac).perform();
		
		WebElement sel = orac.findElement(By.xpath("//span[contains(text(),'Oracle SQL')]"));
		sel.click();
		
		
		
		
		
		
		
		
		
	
	

}
}
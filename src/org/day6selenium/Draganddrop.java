package org.day6selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
		action.dragAndDrop(src, drop).perform();
		
		Thread.sleep(2000);
		
		WebElement amoun = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement drop2 = driver.findElement(By.xpath("((//div[@class='ui-widget-content'])[3]"));
		action.dragAndDrop(amoun, drop2).perform();
		
		Thread.sleep(2000);
		
		WebElement seal = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dro = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		action.dragAndDrop(seal, dro).perform();
		
		Thread.sleep(2000);
		WebElement se = driver.findElement(By.xpath("//a[text()=' 5000 '] "));
		WebElement drop3 = driver.findElement(By.xpath("((//ol[@align='center'])[4])"));
		action.dragAndDrop(se, drop3).perform();
		
      Thread.sleep(2000);

      WebElement click = driver.findElement(By.xpath("//a[text()='Perfect!']"));
      String text = click.getText();
      System.out.println(text);
      click.click();
		
		
		
	}

}

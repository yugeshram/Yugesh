package com.lasteday16clss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		
		
		
		List<WebElement> fram = driver.findElements(By.tagName("iframe"));
		int size = fram.size();
		System.out.println(size);
		
		driver.switchTo().frame(0);
		WebElement textuse = driver.findElement(By.tagName("input"));
		textuse.sendKeys("yugehram");
		
		driver.switchTo().frame("frame3");
		
		WebElement chk = driver.findElement(By.id("a"));
		chk.click();
		
		driver.switchTo().defaultContent();
		
		WebElement last = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(last);
		
		WebElement Ddn = driver.findElement(By.id("animals"));
		
		
		Select se = new Select(Ddn);
		
		
		se.selectByIndex(2);
	    
		List<WebElement> allSelectedOptions = se.getOptions();
		int size2 = allSelectedOptions.size();
		System.out.println(size2);
		for (int i = 0; i <allSelectedOptions.size(); i++) {
			WebElement element = allSelectedOptions.get(i);
			String text = element.getText();
			System.out.println(text);
			
		}
		
		
		
		
		
	
		
		   
		 
		 
		 
		 
		
	}

}

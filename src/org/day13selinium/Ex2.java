package org.day13selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Ex2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(opt);

                  driver.get("https://demoqa.com/select-menu");
                  driver.manage().window().maximize();
                  
                  WebElement sel = driver.findElement(By.id("cars"));
                  
                  Select se = new Select(sel);
                  
                  se.selectByIndex(0);
                  se.selectByValue("saab");
                  se.selectByVisibleText("Opel");
                  
                  List<WebElement> options = se.getOptions();
                  for (int i = 0; i < options.size(); i++) {
                	se.selectByIndex(i);
					
				}
		
	}
	
}

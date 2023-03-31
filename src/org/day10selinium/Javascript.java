package org.day10selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javascript {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement textuser = driver.findElement(By.id("email"));
		
		JavascriptExecutor executer = (JavascriptExecutor) driver;
	
	   executer.executeScript("arguments[0].setAttribute('value','greens')", textuser);
	   Object text1 = executer.executeScript("return arguments[0].getAttribute('value')", textuser);
	   System.out.println(text1);
		 
		 
		 WebElement textpass = driver.findElement(By.id("pass"));
		 executer.executeScript("arguments[0].setAttribute('value','grenns123')", textpass);
		 Object text2 = executer.executeScript("return arguments[0].getAttribute('value')", textpass);
		 System.out.println(text2);
		 
		 WebElement click = driver.findElement(By.name("login"));
		 
		 executer.executeScript("arguments[0].click()", click);
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
	}

}

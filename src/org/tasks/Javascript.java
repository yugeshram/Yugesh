package org.tasks;

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
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		WebElement textuser = driver.findElement(By.id("email"));
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].setAttribute('value','yugesh ram')", textuser);
		Object tex = exe.executeScript("return arguments[0].getAttribute('value')", textuser);
		System.out.println(tex);
		
		WebElement textpas = driver.findElement(By.id("pass"));
		exe.executeScript("arguments[0].setAttribute('value','1233')", textpas);
		Object text = exe.executeScript("return arguments[0].getAttribute('value')", textpas);
		System.out.println(text);
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		exe.executeScript("arguments[0].click()", login);
		Object tex3 = exe.executeScript("return arguments[0].getAttribute('value')", login);
		System.out.println(tex3);
		
	}

}

package org.day12;

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
		//--remote-allow-origins=*
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement skil = driver.findElement(By.id("Skills"));
		
		Select se = new Select(skil);
		
		se.selectByIndex(5);
		se.selectByValue("Analytics");
		se.selectByVisibleText("Art Design");
		
		List<WebElement> options = se.getOptions();
		
		WebElement webElement = options.get(5);
		String text2 = webElement.getText();
		System.out.println(text2);
		
		for (int i = 0; i <options.size(); i++) {
			
			WebElement Element = options.get(i);
			String text = Element.getText();
			System.out.println(text);
		}

	
	
		
	
	
	
	}

}

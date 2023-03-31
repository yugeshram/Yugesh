package org.day12;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement dwn = driver.findElement(By.id("Skills"));
		
		Select sc = new Select(dwn);
		
		sc.selectByValue("Adobe Photoshop");
        sc.selectByIndex(0);
        sc.selectByVisibleText("Art Design");
        
      //  System.out.println("-______-_______________--____________-");
        
		
		List<WebElement> options = sc.getOptions();
		int size = options.size();
		System.out.println(size);
		
		WebElement web = options.get(10);
		String text = web.getText();
		System.out.println(text);
		
		for (int i = 0; i <options.size(); i++) {
			WebElement Element = options.get(i);
			String text2 = Element.getText();
			System.out.println(text2);
			
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
			
			
		}
		
		
		
		
		
		
	}
	



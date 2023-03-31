package org.day13selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Selectopt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement dwn = driver.findElement(By.id("cars"));
		
		Select sc = new Select(dwn);
		sc.selectByIndex(0);
		sc.selectByValue("saab");
		sc.selectByVisibleText("Audi");
		
		Select sc1 = new Select(dwn);
		
		List<WebElement> options = sc1.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (int i = 0; i <options.size(); i++) {
			
			WebElement Element = options.get(i);
	        String text = Element.getText();
	        System.out.println(text);
	        
		}
		
		Select sc2 = new Select(dwn);
		
		List<WebElement> options2 = sc2.getOptions();
		
		
		for (WebElement Element : options2) {
             String text = Element.getText();
             sc2.selectByVisibleText(text);
             
             
		}
	Select se = new Select(dwn);
	List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
	for (WebElement Element : allSelectedOptions) {
	              String text = Element.getText();
	              System.out.println(text);
	}
	
	Select se3 = new Select(dwn);
	
	se3.deselectByIndex(3);
	se3.deselectByValue("saab");
    se3.deselectByVisibleText("Audi");
    
    se3.deselectAll();
    
    boolean multiple = se3.isMultiple();
    System.out.println(multiple);
	
	

}
}

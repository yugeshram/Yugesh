package day4selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrom.driver", 
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement lin = driver.findElement(By.xpath("//a[contains(@class,'_8esh')]"));
	    // lin.click();
		
		//WebElement link = driver.findElement(By.xpath("//a[contains(text(),a Page')]"));
		//link.click();
		
	   String text = lin.getText();
	        System.out.println(text);
		lin.click();
		
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys("green");
		
		String attribute = textuser.getAttribute("value");
		System.out.println(attribute);
	}

}

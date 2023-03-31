package day3selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("yugesh");
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@id='pass']"));
		
		findElement2.sendKeys("1234");
		
		
		
	}

}

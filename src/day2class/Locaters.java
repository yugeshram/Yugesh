package day2class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		
		
		
		WebElement textuser = dr.findElement(By.id("email"));
		textuser.sendKeys("8056634940");
		
		WebElement textpass = dr.findElement(By.id("pass"));
		textpass.sendKeys("yugeshram1234");
		
		WebElement login = dr.findElement(By.name("login"));
		
		login.click();
		
		
		
		
		
	}

}

package day1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Insta {
	
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", 
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement textuser = driver.findElement(By.xpath("//div[@class='x-14s0dn4 x1npaq5j x1c83p5e x1enjb0b x199158v x9f619 x78zum5 x1q0g3np xvs91rp x1n2onr6 xh8yej3 xnz67gz x5n08af xx7zo7k x1fzb3qy xb0nk2e xubunj8']"));
		textuser.sendKeys("yugesh");
		
		WebElement textpass = driver.findElement(By.xpath("(//input[@aria-required='true'])[2]"));
		textpass.sendKeys("1223");
		
	}
	
}

package day3selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobut {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement firsname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firsname.sendKeys("yugesh");
		
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("ram");
		
		//WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		//first.sendKeys("ram");
		
		
		WebElement rad = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		rad.click();
		
		WebElement radi = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radi.click();
		
		
		
		WebElement find1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		find1.click();
		
		WebElement find2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		find2.click();
		
		WebElement find3= driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		find3.click();
		
		WebElement find4= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		find4.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package day4selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textandcontains {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		// locating by the text
		//WebElement lin = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		
		//lin.click();
		
		//ocating by the partial text using contains
		
	
		WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'a Page')]"));
		String text = findElement.getText();
		System.out.println(text);
		
		
		
	}

}

package org.day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.drver.chrome", 
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		
		List<WebElement> tablerow = table.findElements(By.tagName("tr"));
		int size = tablerow.size();
		System.out.println(size);
		
		List<WebElement> tablecolem = table.findElements(By.tagName("th"));
		int size2 = tablecolem.size();
		System.out.println(size2);

		List<WebElement> tabledata= table.findElements(By.tagName("td"));
		int size3 = tabledata.size();
		System.out.println(size3);
		
		String text = tablerow.get(3).getText();
		System.out.println(text);
		
		for (int i = 0; i <tablerow.size(); i++) {
			
			String text2 = tablerow.get(i).getText();
			System.out.println(text2);
			
		}
		System.out.println("-----------------------------------------------------");
		List<WebElement> rowdata = table.findElements(By.tagName("td"));
	
	             for (int i = 0; i <rowdata.size(); i++) {
					WebElement roWdata = rowdata.get(i);
					String text3 = roWdata.getText();
					System.out.println(text3);
				}
	             
	             
	             
	      System.out.println("----------------------------------------------");       
	             for (int i = 0; i < tablerow.size(); i++) {
	            	 List<WebElement> alldata = tablerow.get(i).findElements(By.tagName("td"));
	            	// int size4 = alldata.size();
	            	 //System.out.println("count the all datas-----------"+size4);
	            	 
	            	 for (int j = 0; j <alldata.size(); j++) {
	            		  String text4 = alldata.get(j).getText();
	            		  System.out.println(text4);
						
					}
	            	 
					
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

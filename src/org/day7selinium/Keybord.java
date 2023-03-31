package org.day7selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keybord {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Robot rob = new Robot();
		
		
		
		rob.keyPress(KeyEvent.VK_SHIFT);
		rob.keyPress(KeyEvent.VK_Y);
		rob.keyRelease(KeyEvent.VK_Y);
		rob.keyPress(KeyEvent.VK_U);
		rob.keyRelease(KeyEvent.VK_U);
		rob.keyRelease(KeyEvent.VK_SHIFT);
		
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		
		
		rob.keyPress(KeyEvent.VK_1);
		rob.keyRelease(KeyEvent.VK_1);
		rob.keyPress(KeyEvent.VK_2);
		rob.keyRelease(KeyEvent.VK_2);
		
		
		
		
		
		
		
	}

}

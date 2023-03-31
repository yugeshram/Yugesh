package org.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Capsock {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\muthu\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(opt);
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	
	Robot r = new Robot();
	
	for (int i = 0; i < 2; i++) {
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
	}
	r.keyPress(KeyEvent.VK_CAPS_LOCK);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_P);
	r.keyPress(KeyEvent.VK_Y);
	r.keyRelease(KeyEvent.VK_Y);
	r.keyPress(KeyEvent.VK_R);
	r.keyRelease(KeyEvent.VK_R);
	r.keyRelease(KeyEvent.VK_CAPS_LOCK);
	
	

}
}
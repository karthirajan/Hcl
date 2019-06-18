package org.com;

public interface Software {

	void softwareResources();
}
package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\93ksr\\Bala\\Selenium\\driver\\chromedriver1.exe");
		
		WebDriver dri=new ChromeDriver();
		
		dri.manage().window().maximize();
		
		dri.get("https://www.google.co.in/");
		
		WebElement ent = dri.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		ent.sendKeys("Gmail");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		WebElement clk = dri.findElement(By.xpath("//input[@class='gNO89b'][2]"));
		
		clk.click();
	}
}

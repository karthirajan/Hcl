package org.greens.nav;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prepare {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement cl = driver.findElement(By.xpath("//body/div[2]//button"));
		cl.click();
		WebElement sea = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		sea.sendKeys("mobiles");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		List<WebElement> li = driver.findElements(By.xpath("//body/div//div[@class='_3wU53n']"));
		for (WebElement x : li) {
			System.out.println(x.getText());
			
		}
		
	}

}

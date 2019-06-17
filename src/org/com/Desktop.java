package org.sel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart1 {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\93ksr\\eclipse-workspace\\Bala\\Selenium\\driver\\chromedriver1.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/search?q=Mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	driver.manage().window().maximize();
	
	 List<WebElement> l = driver.findElements(By.xpath("//body/div/div/div[3]/div[2]/div/div[2]//child::div[@class='_3wU53n']"));
	
	 
	 for(WebElement w:l)
	 {
		 System.out.println(w.getText());
	 }
	
	}
}

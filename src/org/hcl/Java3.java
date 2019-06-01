package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\93ksr\\Bala\\Selenium\\driver\\chromedriver.exe" );
		
		WebDriver d=new ChromeDriver();
		
		
		
		d.get("http://www.greenstechnologys.com/index.html");
		
		WebElement msc = d.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions acc=new Actions(d);
		
		acc.moveToElement(msc).perform();
		
		Thread.sleep(3000);
		
				
	}

}


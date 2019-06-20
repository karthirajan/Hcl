package org.hcl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SINDHU\\vasavi\\Selenium\\Driver\\chromedriver.exe");
	     WebDriver driver =new ChromeDriver();
	     driver.get("https://www.amazon.in/");
	  try {
		  WebElement signin = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		  signin.isDisplayed();
		  signin.click();
		
	} catch (Exception e) {
		System.out.println("popup is not displayed");
	}
	  WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	  search.sendKeys("mobiles");
	  WebElement searchclick = driver.findElement(By.xpath("//input[@type='submit']"));
	     searchclick.click();
	     List<WebElement> mobileName = driver.findElements(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div/div/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]//h2[1]//a/span"));
	     
	    	 for (int i = 0; i < mobileName.size(); i++) {
	    		 String name = mobileName.get(i).getText();
				System.out.println(name);
			}
	     
	 }
	    		 
	}  		 
	    		 
	     
	 
	 



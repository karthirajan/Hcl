package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vasavi {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\vasavi\\gitday3\\Hcl\\lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.toolsqa.com/automation-practice-form/");
    WebElement firstname = driver.findElement(By.name("firstname"));
   firstname.sendKeys("Vasavi");
   WebElement lastname = driver.findElement(By.name("lastname"));
   lastname.sendKeys("Patnana");
   WebElement femalebtn = driver.findElement(By.id("sex-1"));
   femalebtn.click();
   WebElement experience = driver.findElement(By.id("exp-2"));
   experience.click();
   WebElement date = driver.findElement(By.id("datepicker"));
   date.sendKeys("13-06-2019");
   


	
		
}

}

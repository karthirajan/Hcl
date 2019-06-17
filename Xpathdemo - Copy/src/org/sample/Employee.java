package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Manikandan\\eclipse-workspace\\Xpathdemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement srch = driver.findElement(By.xpath("//body/div/div/div/div/div/div[2]//input[@title='Search for products, brands and more']"));
		srch.sendKeys("mobiles");
		WebElement btnclick = driver.findElement(By.xpath("//body/div/div/div/div/div/div[2]//button"));
		btnclick.click();
		List <WebElement> mob = driver.findElements(By.xpath("//body/div/div//div[@class='_3e7xtJ']//div[contains(text(),' GB)')]"));
		for (int i = 0; i < mob.size(); i++) {
			WebElement String=mob.get(i).getAttribute();
			System.out.println(String);
		}	
	}

}

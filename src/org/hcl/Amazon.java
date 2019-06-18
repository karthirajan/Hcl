package org.hcl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Bharath Koye//workspace//New folder//SampleJavaProject//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles",Keys.ENTER);
		List<WebElement> MobileName=driver.findElements(By.xpath("//div[@id='search']/div/div[2]/div/span[3]/div[@class='s-result-list s-search-results sg-row']//following-sibling::div/div/div[2]//h2//span[contains(text(),'GB')]"));
		 for (int i = 0; i < MobileName.size(); i++) {
			String name=MobileName.get(i).getText();
			System.out.println(name);
		 }
		driver.quit();
	}


}

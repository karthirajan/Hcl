package org.hcl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\93ksr\\Bala\\SeleniumNew\\driverchromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Forgotten account?'][1]"));
		
		click.click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> All = driver.getWindowHandles();
		
		System.out.println(parent);
		System.out.println(All);
		
		for(String x:All)
		{
			if(!x.equals(parent))
			{
				driver.switchTo().window(x);
			}
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("identify_email")).sendKeys("balasana56@gmail.com");
		
			
	
		
	}
}

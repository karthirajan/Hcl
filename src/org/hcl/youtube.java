package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class youtube{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\vasavi\\gitday3\\Hcl\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
            driver.get("https://www.youtube.com/");
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("saaho telugu teaser");
		WebElement searchboxclick = driver.findElement(By.id("search-icon-legacy"));
		searchboxclick.click();
		WebElement saaholink = driver.findElement(By.className("yt-simple-endpoint style-scope ytd-video-renderer"));
             saaholink.click();
        	
        
        		
      


		
		

	}

}

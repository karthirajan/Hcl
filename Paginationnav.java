package org.greens.nav;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginationnav {
	static WebDriver driver;
	public static void goToPage(String pageNo) {
		List<WebElement> pages = driver.findElements(By.xpath("//body//main//nav//li"));
		for (int i=0;i<pages.size();i++) {
			String page = pages.get(i).getText();
			if(page.equals(pageNo)) {
				pages.get(i).findElement(By.tagName("a")).click();
				break;
				}
		}
		
		
 }
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.bing.com/");
	WebElement search = driver.findElement(By.className("b_searchbox"));
	search.sendKeys("football");
	driver.findElement(By.id("sb_form_go")).click();
	Thread.sleep(3000);
	goToPage("4");
	}
}

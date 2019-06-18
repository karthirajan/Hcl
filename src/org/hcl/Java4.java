package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java4 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\93ksr\\Bala\\Selenium\\driver\\chromedriver.exe" );
		
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.facebook.com/");
		
		WebElement email=d.findElement(By.id("email"));
		WebElement pass=d.findElement(By.id("pass"));
		JavascriptExecutor jk=(JavascriptExecutor)d;
		jk.executeScript("arguments[0].setAttribute('value','bala@gmail.com')",email);
		jk.executeScript("arguments[0].setAttribute('value','123456789')",pass);
		
		WebElement btnclk=d.findElement(By.id("loginbutton"));
		
		btnclk.click();
		
		Object obj=jk.executeScript("return arguments[0].getAttribute('value')", email);
		Object obj1=jk.executeScript("return arguments[0].getAttribute('value')", pass);
		
		String text=(String)obj;
		System.out.println(text);
		String text1=(String)obj1;
		System.out.println(text1);
		
		
	}

}

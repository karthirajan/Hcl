package org.hcl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vasavi {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\vasavi\\gitday3\\Hcl\\lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://www.gmail.com/");

		
		
}

}

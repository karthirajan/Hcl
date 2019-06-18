package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public interface HardWare {

	void hardwareResources();
}
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\93ksr\\Bala\\Selenium\\driver\\chromedriver.exe" );
	
	WebDriver d=new ChromeDriver();
	
	//d.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504236063%7Ce%7Cfacebook%20%27%7C&placement=&creative=318504236063&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-360705453827%26loc_physical_ms%3D9061902%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw7_rlBRBaEiwAc23rhojOLTSe99bIEGclzgwzeAFVJG-r9RTPEn9CNaEDKLZdorZ4dCv7ORoC4gQQAvD_BwE");
	
	d.get("http://demo.guru99.com/test/drag_drop.html");
	
WebElement src = d.findElement(By.id("credit2"));

WebElement desc = d.findElement(By.id("bank"));

Actions acc=new Actions(d);
acc.dragAndDrop(src, desc).perform();
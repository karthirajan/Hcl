package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomersteps {
	
	static WebDriver driver;

	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\93ksr\\eclipse-workspace\\Bala\\ZSelenium\\driver\\chromedriver1.exe" );
	 driver=new ChromeDriver();
	 driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() {
		
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	}

	@When("The user filling all the details")
	public void the_user_filling_all_the_details() {
	
		driver.findElement(By.xpath("//label[@for='done']")).click();
		
	driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Bala");
	driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Krishnan");
	driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("bala.krishnan@gmail.com");
	driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Chrompet Chennai");
	driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9896848523");
		
	}

	@When("The user click on the submit button")
	public void the_user_click_on_the_submit_button() {
	
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("The user should displayed the customer id")
	public void the_user_should_displayed_the_customer_id() {
		
	Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	

	}

}


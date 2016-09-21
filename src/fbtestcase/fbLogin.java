package fbtestcase;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


 

public class fbLogin {

	public String baseurl="https://www.facebook.com";
	WebDriver driver;
	
			
	@BeforeTest
	public void launchbrowser(){
	
	System.setProperty("webdriver.firefox.marionette","\\src\resources\\selenium-server-standalone-3.0.0-beta3");
	driver=new FirefoxDriver();
	}
	
	@Test
  public void openfb() {
	driver.get(baseurl);
	WebElement username=driver.findElement(By.id("email"));
	username.sendKeys("emsk_khan@hotmail.com");
	WebElement password=driver.findElement(By.id("pass"));
	password.sendKeys("*******");
	WebElement Login = driver.findElement(By.id("loginbutton"));
	Login.click();
	}
	
	@AfterTest
	public void logout() {	
	WebElement navigation = driver.findElement(By.id("userNavigationLabel"));
	navigation.click();
	driver.close();	
	}
	
	
	
  }


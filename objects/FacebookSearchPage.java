package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FacebookSearchPage
	{
      WebDriver driver;
      
      public FacebookSearchPage(WebDriver driver)
	     {
	    	 this.driver = driver;
	     }
      By username_editbox = By.xpath("//input[@id='email']");
      By password_editbox = By.id("pass");
      By Login_btn = By.name("login");
      By forgot_password = By.xpath("//a[@classs='_97w4']");
		
      
      public void enterUserName()
      {
    	  driver.findElement(username_editbox).clear();
    	  driver.findElement(username_editbox).sendKeys("TestUser");
      }
      
      public void enterPassword()
      {
    	  driver.findElement(password_editbox).clear();
    	  driver.findElement(password_editbox).sendKeys("Vipul");
      }
      
      public void verifyLogin()
      {
    	  driver.findElement(Login_btn).click();
    	  String title = driver.getTitle();
    	  Assert.assertTrue(title.contains("Facebook"));
          System.out.println("Test Completed-Page Verified");
      }
	}

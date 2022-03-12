package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class GoogleSearch 
	{
			WebDriver driver;
			
		     public GoogleSearch(WebDriver driver)
		     {
		    	 this.driver = driver;
		     }
		     
		     By seachbox= By.xpath("//input[@name='q']");
		     By Search_btn = By.xpath("//input[@name='btnK' and @role='button']");
		     By Facebook_link = By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']");
		     //By Facebook_link = By.xpath("//a//h3[text()='Facebook - Log In or Sign Up']");
		     
	 
	         public void searchgoogle(String Searchinput) 
	         {
	        	 try{
	        	 driver.findElement(seachbox).sendKeys(Searchinput);
	        	 Thread.sleep(1000);
	        	 driver.findElement(Search_btn).click();
	        	 Thread.sleep(2000);
	        	 }catch(Exception e){
	        	    System.out.println("Exception Caught"+ e.getMessage());
	        	 }
	         }
	         public void clickOnFacebook()
	         {
	        	 try{
	        		 driver.findElement(Facebook_link).click();
	        		 Thread.sleep(2000);
	        	 }catch(Exception e){
	        		 System.out.println("Exception Caught"+ e.getMessage());
	        	 }
	         }
	     
	}

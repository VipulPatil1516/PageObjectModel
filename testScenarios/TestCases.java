package testScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.FacebookSearchPage;
import objects.GoogleSearch;

public class TestCases
{
	WebDriver driver;
	GoogleSearch ObjectRepo;
	
  @BeforeTest
  public void beforeTest()
  {
     WebDriverManager.chromedriver().setup();
     //System.setProperty("webdriver.chrome.driver","E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
     driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
     driver.get("https://www.google.com/");
  }
  @Test(priority = 0)
  public void searchOperation() throws InterruptedException
  {
	  GoogleSearch page = new GoogleSearch(driver);
	  page.searchgoogle("facebook");
	  Thread.sleep(2000);
  }
  @Test(priority = 1)
  public void verifyAndAccess() throws InterruptedException
  {
	  ObjectRepo = new GoogleSearch(driver);
	  ObjectRepo.clickOnFacebook();
	  Thread.sleep(2000);
  }
  
  @Test(priority = 2)
  public void verifyLogin()
  {
	  FacebookSearchPage page = new FacebookSearchPage(driver);
	  page.enterUserName();
	  page.enterPassword();
	  page.verifyLogin();
  }
  
  @AfterTest
  public void aftertest()
  {
	  driver.quit();
  }
   
}

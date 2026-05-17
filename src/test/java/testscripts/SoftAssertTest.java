package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertTest {
	WebDriver driver;
	@BeforeTest
	   public void openBrowser(ITestContext context) {
	 	  
	 	  launchBrowser(context.getCurrentXmlTest().getParameter("browser"));
	 	 
	   }
	  
	  @Test(alwaysRun=true) 
	  public void test1() {
	 	 System.out.println("Hai, i am test 1");
			
	 	 driver.get("https://selenium.obsqurazone.com/index.php");
	 	 String title=driver.getTitle();
	 	 System.out.println(title);
	 	 String expected="Obsqura tsting";
	 	
	 	//SoftAssert softAssert = new SoftAssert();
	 	SoftAssert softassert=new SoftAssert();
	 	softassert.assertEquals(title, expected,"fail");
	 	System.out.println("pgm will not exit");
	 	softassert.assertAll();
	 	
	 	 }
	  
	  @Parameters({"browser"})
	  
		public void launchBrowser(String browser)
		{
		 
			if(browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Selenium class\\chromedriver_win32 (1)\\chromedriver.exe");
				driver= new ChromeDriver();//initializing chrome
				
				
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{

				System.setProperty("webdriver.gecko.driver", "E:\\OBSQURA\\Selenium class\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				driver= new FirefoxDriver();//initializing chrome
				
			}
			else if(browser.equalsIgnoreCase("edge")) 
			{

				System.setProperty("webdriver.edge.driver", "E:\\OBSQURA\\Selenium class\\edgedriver_win64\\msedgedriver.exe");

				 driver= new EdgeDriver();
				
			}
		}
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }
	
	

}

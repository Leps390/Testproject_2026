package testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DataProviderExample {
	
	
	  @Test(dataProvider="myData")
	  public void loginTest(String uname,String pwd) {
		 System.out.printf("username: "+uname,"password: "+pwd); 
	  }
	  
	
	  
	  @DataProvider(name="myData")
	  public Object[][]getDataFromProvider(){
		  Object obj[][]= {{"username1","password1"},{"username2","password2"},{"username3","password3"}};
		return obj;
		  
	  }
	  
	  
	  
	 
	

}

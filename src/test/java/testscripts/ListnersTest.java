package testscripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListnersTest implements ITestListener{
	
	WebDriver driver;
  @Test
  public void testmethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\OBSQURA\\Selenium class\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();//initializing chrome
		driver.get("https://www.google.com/");
  }
  @Test
public void testmethod1() {
	  
	 
		driver.navigate().to("https://demo.guru99.com/V4/");
	 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Lekshmi");
	 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("pwd");
	 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.close();
  }
//this method is called when a test case is failed
@Override
public void onTestStart(ITestResult result) {
	System.out.println("The success test method  "+result.getName());
	
}
//this method is called when a test is success
@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("The test on success"+result.getName());
	
}

@Override
public void onTestFailure(ITestResult result) {
	System.out.println("The test on failure "+result.getName());
	
}
//when a method is skipped, this method is called
@Override
public void onTestSkipped(ITestResult result) {
	System.out.println("test skipped" +result.getName());
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("failedpercentage:" +result.getName());
	
}

@Override
public void onStart(ITestContext context) {
	System.out.println("onStart method started"+context.getName());
	System.out.println(context.getName());
	
}

@Override
public void onFinish(ITestContext context) {
	System.out.println("onfinish method "+context.getName());

	
}
}

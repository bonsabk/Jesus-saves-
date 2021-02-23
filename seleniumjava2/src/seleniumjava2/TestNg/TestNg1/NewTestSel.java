package seleniumjava2.TestNg.TestNg1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTestSel {
	
public String url ="https://www.google.com";
String path = "\"C:\\\\Users\\\\bonsa\\\\Downloads\\\\chromedriver_win32\\\\chromedri";
public WebDriver driver;
@BeforeTest
public void lanch_browser() {
	System.setProperty("webDriver.chrome.driver",path);
	driver.get(url);
}
   @Test
   public void verifytitle() {
	   String exp_title = "google";
	   String actual_title = driver.getTitle();
	   Assert.assertEquals(exp_title , actual_title);
   }
  
}

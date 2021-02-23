


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class busbudEndToEnd {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bonsa\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
//		 driver = new FirefoxDriver();
System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver= new ChromeDriver();
	     driver.get("https://www.busbud.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	     
	     Select s = new Select(driver.findElement(By.id("roundtrip-toggler")));
	      s.selectByVisibleText("Round trip");
	    
	      
	      //driver.findElement(By.id("origin-c1ty-input")).click();
	     WebElement city =driver.findElement(By.id("origin-c1ty-input"));
	     city.sendKeys("Los");
	     Thread.sleep(4000);
	     city.sendKeys(Keys.ARROW_DOWN);
	     city.sendKeys(Keys.ENTER);
	     Thread.sleep(4000);
	     
	     WebElement city1 = driver.findElement(By.xpath("//input[contains(@id,'destination-c1ty-input')]"));
	     city1.sendKeys("washington");
	     city1.sendKeys(Keys.ARROW_DOWN);
	     city1.sendKeys(Keys.ENTER);
	     Thread.sleep(4000);
	  
//	      busbudEndToEnd jav = new  busbudEndToEnd();
//	      jav.calender();
	      JavascriptExecutor js=(JavascriptExecutor)driver;

	        js.executeScript("document.getElementByName('outbound_date').value='2021-02-20'");
	       // js.executeAsyncScript("document.getElementById('return-date-input').value='2021-02-25'");
	     
	     
	     Thread.sleep(4000);
	      driver.findElement(By.xpath( "//input[contains(@id,'passenger-input')]")).click();
	     int i=1;
			while(i<3) {		
			driver.findElement(By.xpath("//button[@aria-label='+ Adults']")).click();
			i++;
			
			}
			driver.findElement(By.xpath("(//a[contains(@class,'js-dropdown-close')])[3]")).click();
			Thread.sleep(3000);
            driver.findElement(By.xpath("(//button[contains(.,'Search')])[1]")).click();
	     
	    
	     
	
	
	}
	
	public void calender() throws InterruptedException {
        Thread.sleep(4000);
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//
//        js.executeScript("document.getElementByName('outbound_date').value='2021-02-20'");
//       // js.executeAsyncScript("document.getElementById('return-date-input').value='2021-02-25'");
	}
	
}

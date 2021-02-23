package seleniumjava2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuIEndtoEnd {

	static WebDriver driver;

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		     WebDriver  driver =new ChromeDriver() ;
		     driver.get("https://www.cleartrip.com//");
		          
		     driver.findElement(By.id("RoundTrip")).click();
		     driver.findElement(By.id("FromTag")).sendKeys("Mumbai, IN - Chatrapati Shivaji Airport (BOM)");
		     Thread.sleep(3000);
		     driver.findElement(By.id("FromTag")).sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");
		     JavascriptExecutor js =(JavascriptExecutor)driver;
		     js.executeScript("document.getElementByid('DepartDate').value='27/01/2021'");
		     js.executeScript("document.getElementByid('ReturnDate').value='05/02/2021'");
		     
		     Select a =new Select(driver.findElement(By.id("Adults")));
		     a.selectByIndex(2);
		     Select c= new Select(driver.findElement(By.id("Childrens")));
		     c.selectByIndex(2); 
		     Select i =new Select(driver.findElement(By.id("Infants")));
		     i.selectByIndex(1);
		     
		     driver.findElement(By.id("SearchBtn")).click();
	}

}

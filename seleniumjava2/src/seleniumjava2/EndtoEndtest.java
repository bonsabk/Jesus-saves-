package seleniumjava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class EndtoEndtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		
	WebDriver chro = new ChromeDriver();
    chro.get("https://www.spicejet.com");
  //radio button
    chro.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
    
    //departure and arrival dropdown
    chro.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    chro.findElement(By.xpath("//a[@value='RDP']")).click();
    Thread.sleep(2000);
    chro.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
    
    //calendor
  
   // chro.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
    chro.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
   // chro.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
 
    // passangers
    
//    chro.findElement(By.id("divpaxinfo")).click();
//    Select a = new Select(chro.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//    a.selectByValue("3");
//    Select c = new Select(chro.findElement(By.id("ctl00_mainContent_ddl_Child")));
//    c.selectByIndex(1);
//    Select i = new Select(chro.findElement(By.id("ctl00_mainContent_ddl_Infant")));
//    i.selectByVisibleText("1");
//    
//    //currency
//    Select s = new Select(chro.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))); 
//  //s.selectByValue("INR");
//   //s.selectByIndex(0);
//  s.selectByVisibleText("USD");
  
  //search button
  
    chro.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		
		
	}

}

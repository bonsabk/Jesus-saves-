package seleniumjava2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrivalTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http:www.spicejet.com");
		String Month="June 2021";
		String date="20";
         
		  driver.get("http:www.spicejet.com");
		  
		    //radio button
			 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();//roundtrip
			 Thread.sleep(2000);
			  
			 //departure and arrival dropdown
			 
//			    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//			    driver.findElement(By.xpath("//a[@value='RDP']")).click();
//			    Thread.sleep(2000);
//			    driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
			    
			    //departure and arrival Date
			 driver.findElement(By.xpath("(//button[contains(@type,'button')])[1]")).click();//calender dd
          
			Thread.sleep(2000);
		
			while(true)	
		{
       String text=  driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();//january 2021
         //System.out.println(text);
       if(text.equals(Month))
       {
    	   break;
       }
       else
       {
    	   driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-triangle-e')]")).click();//next month
       }
		
		}
			
  List<WebElement> allDates =driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td/a[1]"));//multiple days
  
 
    for(WebElement ele:allDates) {
	  
    	System.out.println(ele.getText());
    	 String dateexp=ele.getText();
    	 
    	 
    	     if(dateexp.equals(date)) {
    		    ele.click();
    		    break;
    	 }
     
     }
		
		
		String month = "July 2021";
	        String Day = "20";
		 
			driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_view_date2')]")).click();
			while(true)
			{
		String text = driver.findElement(By.xpath("(//div[contains(@class,'ui-datepicker-title')])[1]")).getText();
		//System.out.println(text);
		if (text.equals(month))
		{
			break;
		}
		
		else
			{
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all'][contains(.,'Next')]")).click();
			}
		
			}
	
	 List<WebElement>ArDate= driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td/a[1][contains(text(),'20')]"));
	 
	 for( WebElement e:ArDate) {
		 System.out.println(e.getText());
    	 String dateexp=e.getText();
    	 
    	     if(dateexp.equals(Day)) {
    		    e.click();
    		    break;
		 
	 }
	
	 }
	
	 // passangers
	    
	    driver.findElement(By.id("divpaxinfo")).click();
	    Select a = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	    a.selectByValue("3");
	    Select c = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
	    c.selectByIndex(1);
	    Select i = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
	    i.selectByVisibleText("1");
	    
	    //currency
	    Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))); 
	  //s.selectByValue("INR");
	   //s.selectByIndex(0);
	  s.selectByVisibleText("USD");
	  
	  //search button
	  
	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	    
	
	
	 
	 
	}
	
	
	

}

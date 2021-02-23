package seleniumjava2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateCalenderTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		  
		String Month="June 2021";
		String date="20";
         
		  ChromeDriver chro = new ChromeDriver();
			
			chro.get("http:www.spicejet.com");
			 ((SearchContext) chro).findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();//roundtrip
			 Thread.sleep(2000);
			
			 chro.findElement(By.xpath("(//button[contains(@type,'button')])[1]")).click();//calender dd
          
			Thread.sleep(2000);
		
			while(true)	
		{
       String text=  chro.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();//january 2021
         //System.out.println(text);
       if(text.equals(Month))
       {
    	   break;
       }
       else
       {
    	   chro.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-triangle-e')]")).click();//next month
       }
		
		}
			
  List<WebElement> allDates =chro.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td/a[1]"));//multiple days
  
 
    for(WebElement ele:allDates) {
	  
    	System.out.println(ele.getText());
    	 String dateexp=ele.getText();
    	 
    	     if(dateexp.equals(date)) {
    		    ele.click();
    		    break;
    	 }
     
     }
    
    
  }

}

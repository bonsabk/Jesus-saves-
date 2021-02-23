package seleniumjava2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEndprojectByDanny {

public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String Month="March 2021";
		String date="31";
         
		  WebDriver web =new ChromeDriver();
			
			web.get("https:www.southwest.com");
			web.findElement(By.xpath("//*[@id=\"TabbedArea_4-panel-0\"]/div/div/div/form/div[1]/div[1]/fieldset/ul/li[1]/label/input")).click();
			                     //Depart from
//	  web.findElement(By.xpath("//*[@id=\"TabbedArea_4-panel-0\"]/div/div/div/form/div[2]/div[1]/div[1]/label/span")).click();
//		  web.findElement(By.xpath("//*[@id=\"LandingAirBookingSearchForm_originationAirportCode\"]")).sendKeys("DCA");
		  Thread.sleep(3000);
//		  web.findElement(By.xpath("//*[@id=\"LandingAirBookingSearchForm_originationAirportCode\"]")).sendKeys(Keys.ARROW_DOWN);
//		 Thread.sleep(3000);
//		  web.findElement(By.xpath("//*[@id=\"LandingAirBookingSearchForm_originationAirportCode\"]")).sendKeys(Keys.ENTER);
	        web.findElement(By.xpath("//*[@id=\"TabbedArea_4-panel-0\"]/div/div/div/form/div[2]/div[1]/div[1]/label/span")).click();
			WebElement from =  web.findElement(By.xpath("//*[@id=\"LandingAirBookingSearchForm_originationAirportCode\"]"));
			from.sendKeys("Dca");
			from.sendKeys(Keys.ARROW_DOWN);
			from.sendKeys(Keys.ENTER);
			
		    Thread.sleep(3000);
			              //Arrive to
//		  web.findElement(By.xpath("//*[@id=\"TabbedArea_4-panel-0\"]/div/div/div/form/div[2]/div[1]/div[2]/label/span")).click();
//		 web.findElement(By.xpath("//*[@id=\"LandingAirBookingSearchForm_destinationAirportCode\"]")).sendKeys("MDW");
//	   	 web.findElement(By.xpath("//*[@id=\"LandingAirBookingSearchForm_destinationAirportCode\"]")).sendKeys(Keys.ENTER);
	   	  Thread.sleep(3000);
		  web.findElement(By.xpath("//*[@id=\"TabbedArea_4-panel-0\"]/div/div/div/form/div[2]/div[1]/div[2]/label/span")).click();
		  WebElement from1 = web.findElement(By.xpath("//*[@id=\"LandingAirBookingSearchForm_destinationAirportCode\"]"));
		 from1.sendKeys("MDW");
		 from1.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
			                  // Depart date
	web.findElement(By.xpath("//*[@id=\"LandingAirBookingSearchForm_departureDate\"]")).click();// Depart Date 
		 while(true) 
		 {
		 String text= web.findElement(By.xpath("(//div[contains(@class,'calendar-month--title')])[1]")).getText();//month
		
		 System.out.println(text);
		 if(text.equals(Month)) {
			 break;
		 }
		 else {
			 
			 web.findElement(By.xpath("(//span[contains(@role,'presentation')])[86]")).click(); // Arrow
		 }
		 
		 }
			 List<WebElement> alldates=web.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div/button"));
		 
		 for(WebElement e:alldates) {                  
			 System.out.println(e.getText());
			 String dateexp=e.getText();
					 if(dateexp.equals(date)) {
						 e.click();
						 break;
						 
							
 }
					 
		  }
			   // Arrive Date
		 Thread.sleep(3000);
		 String month="June 2021";
		 String day="30";
	    
		                      // web.findElement(By.id("LandingAirBookingSearchForm_returnDate")).click();
		
		 while(true) {
			
			String Text=web.findElement(By.xpath("(//div[contains(@class,'calendar-month--title')])[1]")).getText();
			//System.out.println(Text);
			if(Text.equals(month)) {
				break;
			}
			else {
				web.findElement(By.xpath("(//span[contains(@role,'presentation')])[86]")).click();
			}
		}
		List<WebElement>dates=web.findElements(By.xpath(" html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div/button"));
		for(WebElement w:dates) {
			String expdate=w.getText();
			if(expdate.equals(day)) {
				w.click();
				break;
			}
		}
			               //Passenger
		Thread.sleep(3000);
	web.findElement(By.xpath("(//span[contains(@class,'form-control--label')])[5]")).click();
	 web.findElement(By.xpath("//input[@aria-autocomplete='list']"));
	     web.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys(Keys.values());
		web.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys(Keys.ARROW_DOWN);
		web.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
		                // value earn
		web.findElement(By.xpath("//input[contains(@value,'USD')]")).click();
		web.findElement(By.xpath("(//span[@class='form-control--label'])[6]")).click();
		               //promoCode
		web.findElement(By.xpath("//input[contains(@id,'promoCode')]")).sendKeys("123456");
	
		
	Thread.sleep(4000);
		// List<WebElement> AllTags =web.findElements(By.tagName("div"));
		//System.out.println(AllTags.size());
		 
	
		          // search button
	 web.findElement(By.xpath("(//button[contains(@type,'button')])[15]")).click();
	 
	
	
	}


}


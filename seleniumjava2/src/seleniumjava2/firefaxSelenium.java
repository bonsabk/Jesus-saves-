package seleniumjava2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class firefaxSelenium {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\bonsa\\Downloads\\geckodriver-v0.29.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.busbud.com/");
		Select s = new Select (driver.findElement(By.id("roundtrip-toggler")));
		s.selectByVisibleText("Round trip");
		driver.findElement(By.id("origin-c1ty-input")).click();
		((WebElement) driver).findElement(By.xpath("//input[@value='Washington']")).sendKeys("wash");
		driver.findElement(By.xpath("//input[@value='Washington']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@value='Washington']")).sendKeys(Keys.ENTER);//	        while(true) 
//	 {
//	 String text= driver.findElement(By.xpath("(//div[@class='month'])[1]")).getText();//month
//	
//	 //System.out.println(text);
//	 if(text.equals(month)) {
//	 break;
//	 }
// else {
//	 
//	 driver.findElement(By.xpath("(//div[contains(@data-next-month,'true')])[1]")).click(); // Arrow
//	 
// }	 
//	
//}
	     
	     //driver.findElement(By.xpath("(//div[contains(@class,'5')])[5]")).click();
//	        Thread.sleep(4000);
//   driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/div[2]/div[8]/div[contains(text(),"+date+")]")).click();


//List<WebElement> alldates=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/div[2]/div[8]/div[contains(text(),'30')]"));
//		Thread.sleep(4000);
//   System.out.println(alldates);
//		 for(WebElement e:alldates) {                  
//			 System.out.println(e.getText());
//			 String dateexp=e.getText();
//					 if(dateexp.equals(date)) {
//						 e.click();
//						 break;
//							 
//					 }
//		 }
 
					 
			  }

	
	}
  
  

	
		
		
		
		
		
		
	
	


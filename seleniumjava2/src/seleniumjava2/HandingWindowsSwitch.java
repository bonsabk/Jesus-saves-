package seleniumjava2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingWindowsSwitch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	  ChromeDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.salesforce.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("(//span[contains(.,'Start my free trial')])[1]")).click();
	
	 
 Set<String>windowhandles= driver.getWindowHandles();
	System.out.println(windowhandles);
	
	Iterator<String> iterator =windowhandles.iterator();
	
	String P1 =iterator.next();
	System.out.println(P1);
	String c1 =iterator.next();
	System.out.println(c1);
	driver.switchTo().window(c1);
	
driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Daniel");
driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Erana");
//driver.switchTo().window(P1); 

			  
	
	
	
	
	
	
	
	
	
	
	}

}

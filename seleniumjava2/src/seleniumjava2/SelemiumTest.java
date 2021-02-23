package seleniumjava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelemiumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver= new ChromeDriver();
      // driver.get("https://www.facebook.com/");
		//WebDriver driv1= new ChromeDriver();
		//driv1.get("http://api.icraftsoft.net/register/#!/");
		String baseUrl = "http://api.icraftsoft.net/register/#!/";
		WebDriver drive2= new ChromeDriver();
		drive2.get(baseUrl);
		Thread.sleep(5000);
		drive2.findElement(By.xpath("//input[@id='first']")).sendKeys("Daniel");
		drive2.findElement(By.id("last")).sendKeys("Erana");
		drive2.findElement(By.id("department")).sendKeys("QA batch 07");
		drive2.findElement(By.className("btn-primary")).click();
		
		//drive2.close();
       
        
       
	
		
		
	}

}

package seleniumjava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EndToGrayhoand {
      static RemoteWebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.greyhound.com/");
       Thread.sleep(4000);
		driver.findElement(By.id("fromLocation-label"));
	    
	    
	  
	    

	    
	    
	    
	}

}

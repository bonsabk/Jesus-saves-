package seleniumjava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driverone= new ChromeDriver();
          driverone.get("https://www.facebook.com/");
            //driverone.get("https://login.salesforce.com/");
//          driverone.findElement(By.id("username")).sendKeys("Danny");
//          //driverone.findElement(By.id("password")).sendKeys("Tariku2112");
//          driverone.findElement(By.name("pw")).sendKeys("Tariku2112");
//          driverone.findElement(By.id("Login")).click();
          
       driverone.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("craftsoft");
        driverone.findElement(By.className("input r4 wide mb16 mt8 password")).sendKeys("Tariku2112");
       driverone.findElement(By.className("button r4 wide primary")).click();
         
         // driverone.findElement(By.linkText("Forgot Your Password?")).click();
          // driverone.findElement(By.linkText("Try for Free")).click();
           //driverone.findElement(By.linkText("Use Custom Domain")).click();
           //driverone.findElement(By.id("email")).sendKeys("bonsabk30@gmail.com");
           //driverone.findElement(By.id("pass")).sendKeys("Tariku2020");
          //driverone.findElement(By.name("login")).click();
           
            
           
            
          
  		
         
         
         
	}
	}

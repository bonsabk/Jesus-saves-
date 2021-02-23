package seleniumjava2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
          driver.get("https:www.southwest.com");
          driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
  	List<WebElement> AllTags =driver.findElements(By.tagName("div"));
  			System.out.println("The total tags are:"+AllTags.size());
  			for (int i = 0;i<AllTags.size(); i++) {
  				System.out.println("link on page are:"+ AllTags.get(i).getAttribute("div"));
  				System.out.println("link on page are :"+AllTags.get(i).getText());
  				
  				
  			}
	}

}

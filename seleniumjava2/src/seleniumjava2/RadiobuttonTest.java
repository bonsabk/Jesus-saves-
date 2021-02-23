package seleniumjava2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         driver.get("https:www.southwest.com");
         driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
 		WebElement radio = driver.findElement(By.xpath("//span[@class='radio-button--content'][contains(.,'One-way')]"));
 		radio.click();
 		System.out.println(radio.isSelected());
	  // WebElement radio1 = driver.findElement(By.xpath("//span[@class='radio-button--content'][contains(.,'Round trip')]"));
		//radio1.click();
		//System.out.println(radio1.isSelected());
	     System.out.println(driver.findElements(By.xpath("//*[@class ='radio-button--content']")).size());
 	
 	
 		
 		

 		
	}

}

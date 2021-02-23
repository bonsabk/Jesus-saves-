

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=  new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			String text = "Danny";
		   driver.findElement(By.id("name")).sendKeys(text);
			
			
			//AlertButton
			driver.findElement(By.id("alertbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept(); //click on OK button
			
		//ConfirmButton 
	   driver.findElement(By.id("confirmbtn")).click();
	  System.out.println(driver.switchTo().alert().getText());
			//driver.switchTo().alert().dismiss(); //click on cancel button

	  
	  

	}

}

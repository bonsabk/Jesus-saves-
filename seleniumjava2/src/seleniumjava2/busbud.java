package seleniumjava2;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class busbud {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bonsa\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	   
	     driver.get("https://www.busbud.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	   
	     //driver.findElement(By.id("origin-c1ty-input")).click();
	     WebElement city =driver.findElement(By.id("origin-c1ty-input"));
	     city.sendKeys("Los");
	     Thread.sleep(4000);
	     city.sendKeys(Keys.ARROW_DOWN);
	     city.sendKeys(Keys.ENTER);
	     Thread.sleep(4000);
	     WebElement city1 = driver.findElement(By.xpath(""));
	     city1.sendKeys("");
	     
	     
	     
	     
	
	
	}

}

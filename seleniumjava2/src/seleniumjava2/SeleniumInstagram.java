package seleniumjava2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInstagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drive2 = new ChromeDriver();
		drive2.get("https://www.instagram.com");
		drive2.manage().window().maximize();
		drive2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		drive2.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	drive2.findElement(By.name("username")).sendKeys("bonsabk30@gmail.com");
	drive2.findElement(By.name("password")).sendKeys("Tariku2020");
	drive2.findElement(By.xpath("(//div[contains(.,'Log In')])[6]")).click();
	
	
	}

}

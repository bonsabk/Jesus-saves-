package seleniumjava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selemiumTest2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		//String baseurl1= "http://api.icraftsoft.net/register/#!/create";
		String hiwot = "https://hiwotfashion.com/en/";
		//Driver3.get(baseurl1);
		driver3.get(hiwot);
		Thread.sleep(4000);
		System.out.println(driver3.getTitle());
		//System.out.println(driver3.getPageSource());
	    System.out.println(driver3.getCurrentUrl());
	   Thread.sleep(600);
	   // driver3.close();
	    
	}

}

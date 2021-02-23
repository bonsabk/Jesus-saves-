package seleniumjava2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreyhoundwithJava {

	static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\bonsa\\Downloads\\chromedriver_win32\\chromedriver.exe");
                driver=new ChromeDriver();
                driver.get("https://www.greyhound.com/");
                
//                Actions act = new Actions(driver);
//                act.moveToElement(driver.findElement(By.xpath("//input[@title='Leaving from']")));
//                act.click();
//                Thread.sleep(4000);
//                act.sendKeys(" Ne");
//                act.build().perform();

                GreyhoundwithJava dani1 =new  GreyhoundwithJava();
                dani1.calender();

            }
            public void calender() throws InterruptedException {
                Thread.sleep(4000);
                JavascriptExecutor js=(JavascriptExecutor)driver;

                js.executeScript("document.getElementById('datepicker-from').value='2021-02-20'");
                js.executeAsyncScript("document.getElementById('datepicker-to').value='2021-02-25'");
            }


}


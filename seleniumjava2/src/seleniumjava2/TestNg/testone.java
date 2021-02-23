package seleniumjava2.TestNg;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testone {
	@Test (groups="smoke")
	public void testone()
	{
		
System.out.println("the first test");

}
	@Test
	public void secondtest() {
		System.out.println("the second test");
		
	}
	@BeforeTest
	public void openbrower() {
		System.out.println("open brower");
	}
	@BeforeSuite
	public void browser() {
		System.out.println("browser");
	}
}

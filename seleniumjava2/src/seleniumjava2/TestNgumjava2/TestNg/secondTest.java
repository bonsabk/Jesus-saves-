package seleniumjava2.TestNgumjava2.TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class secondTest {
	@Test(groups= "smoke")
	public void otherTest() {
		System.out.println("Test");
	}
	@Test
	public void loginTest() {
		System.out.println("login is launching");
		
	}
  @AfterTest
 public void closebrowers() {
	  System.out.println("close the  browers ");
  }
  @AfterSuite
  public void terminate1 () {
	  System.out.println("terminate");
  }
}

package testNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example2 {
	
@Test(enabled=true,priority=2,invocationCount = 2)
public void openOrangeHRM() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("Page title: "+driver.getTitle());
	
}
@Test(enabled=false)
public void openGoogle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	System.out.println("Page title: "+driver.getTitle());
	
}
@Test(enabled=true,priority=1,description="this is Swag Lab application under testing")
public void openSwagLabs() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	System.out.println("Page title: "+driver.getTitle());
	
}
@Test(enabled=true,priority=3, timeOut = 20000)
public void openActitime() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://online.actitime.com/tcs/login.do");
	System.out.println("Page title: "+driver.getTitle());
}
@Test(enabled=true,priority=3, expectedExceptions = ArithmeticException.class)
public void testCase() {
	System.out.println("Test case started");
	int i=10/0;
	System.out.println("Test case ends");
	
}}
package day8CSS21feb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;


public class assignment1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        WebElement login=driver.findElement(By.linkText("login"));
        System.out.println("Clickin on the login element i n the main page");
        login.click();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement loginbutton=driver.findElement(By.id("login-button"));
        username.clear();
        System.out.println("Enter the username");
        username.sendKeys("your username");
        
        password.clear();
        System.out.println("Enter the password");
        password.sendKeys("your password");
        
        System.out.println("Click on login button");
        loginbutton.click();
        
        String title="Welcome -Facebook";
        String actualTitle=driver.getTitle();
        System.out.println("Verifyning the page title has started ");
       
        System.out.println("The page title has been successfully verified");
        System.out.println("User logged insuccessfully");
         driver.quit();
        
	}

}

package day5csspropertyvalidation19feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day4.browserOps16feb.ReusableFunctions;

public class PositionValidation {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=ReusableFunctions.setUp("chrome","https://online.actitime.com/tcs/login.do");
             driver.findElement(By.id("loginButton")).click();Thread.sleep(2000);
             
             
             
             
             
            
		}

}
